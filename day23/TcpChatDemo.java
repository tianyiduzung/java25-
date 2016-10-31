

import java.io.*;
import java.net.*;

class  TcpChatClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("192.168.1.126",10007);
		
		//定义读取键盘数据的流对象。
		BufferedReader bufr=
			new BufferedReader(new InputStreamReader(System.in));
		
		//定义目的，将数据写入到Socket输出流，发送给服务端
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		
		//定义一个Socket读取流，读取服务端返回的数据。
		BufferedReader bufIn=
			new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line=null;
		String line1=null;
		while ((line=bufr.readLine())!=null)
		{	
			if("over".equals(line))
				break;
			out.println(line);
			String str=bufIn.readLine();
			System.out.println("server:"+str);

			
		}

		bufr.close();
		s.close();
	}
}


class TcpChatServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(10007);
		Socket s=ss.accept();
		
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		
		BufferedReader bufr=
			new BufferedReader(new InputStreamReader(System.in));
		
		//目的。Socket输出流。将数据写入到Socket输出流，并发送给客户端。	
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		
		//读取Socket读取流中的数据
		BufferedReader bufIn=
			new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line=null;
		String line1=null;
		while ((line=bufIn.readLine())!=null)
		{
			if("over".equals(line))
				break;
			System.out.println("client:"+line);
			String str=bufr.readLine();
			//System.out.println("client:"+str);
			out.println(str);
		}
		bufr.close();
		s.close();
		ss.close();
	}
}
