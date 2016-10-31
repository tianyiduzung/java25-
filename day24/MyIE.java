
import java.io.*;
import java.net.*;

class MyIE 
{
	public static void main(String[] args) 
	{
		Socket s=new Socket("192.168.1.126",8080);

		PrintWriter out=new PrintWriter(s.getOutputStream(),true);

		out.println("GET / myWeb/Demo.html HTTP/1.1");
		out.println("Accept-Language: zh-CN");
		out.println("Host: 192.168.1.126:11000");
		out.println("Connection: closed");

		out.println();
		out.println();

		BufferedReader bufr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;

		while ((line=bufr.readLine())!=null)
		{
			System.out.println(line);
		}
		s.close();
	}
}


/**
192.168.1.126
GET / HTTP/1.1
Accept: text/html, application/xhtml+xml, 
Accept-Language: zh-CN
User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko

Accept-Encoding: gzip, deflate
Host: 192.168.1.126:11000
Connection: Keep-Alive

*/