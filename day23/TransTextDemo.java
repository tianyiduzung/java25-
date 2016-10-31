/*
需求：建立一个文本转换服务器。
客户端给服务端发送文本，服务端会将文本转换成大写再返回给客户端
而且客户端可以不断的进行文本转换。当客户端输入over时，转换结束。

分析：
客户端：
既然是操作设备上的数据，那么就可以使用io技术，并按照io的操作规律来思考。
源：键盘录入。
目的：网络设备，网络输出流。
而且操作的是文本数据。可以选择字符流。

步骤：
1，建立服务。
2，获取键盘录入。
3，将数据发给服务端。
4，获取服务端返回的大写数据。
5，结束，关资源。

都是文本数据，可以使用字符流进行操作，同时提高效率，加入缓冲。

*/

import java.io.*;
import java.net.*;

class  TransClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("192.168.1.126",10005);
		
		//定义读取键盘数据的流对象。
		BufferedReader bufr=
			new BufferedReader(new InputStreamReader(System.in));
		
		//定义目的，将数据写入到Socket输出流，发送给服务端
		//BufferedWriter bufOut=
		//	new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		
		//定义一个Socket读取流，读取服务端返回的大写数据。
		BufferedReader bufIn=
			new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line=null;
		//readLine()读到回车符时才返回数据
		while ((line=bufr.readLine())!=null)
		{
			
			if("over".equals(line))
				break;
			out.println(line);
			//bufOut.write(line);
			//bufOut.newLine();//此句不可少，因为键盘录入时没有读到回车符
			//bufOut.flush();

			String str=bufIn.readLine();
			System.out.println("server:"+str);
		}

		bufr.close();
		s.close();
	}
}

/*
服务端：
源：Socket读取流
目的：Socket输出流
都是文本，装饰。

*/

class TransServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(10005);
		Socket s=ss.accept();
		
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");

		//读取Socket读取流中的数据
		BufferedReader bufIn=
			new BufferedReader(new InputStreamReader(s.getInputStream()));

		//目的。Socket输出流。将大写数据写入到Socket输出流，并发送给客户端。
		//BufferedWriter bufOut=
		//	new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);

		String line=null;
		while ((line=bufIn.readLine())!=null)
		{
			System.out.println("clinet:"+line);

			out.println(line.toUpperCase());
			
			//bufOut.write(line.toUpperCase());
			//bufOut.newLine();//换行为结束标记
			//bufOut.flush();
		}
		s.close();
		ss.close();
	}
}

/*
该例子出现的问题。
现象：客户端和服务端都在莫名的等待。
为什么呢？
因为客户端和服务端都有阻塞式方法。这些方法都没有读到结束标记。
那么就一直等而导致两端都在等待。

*/