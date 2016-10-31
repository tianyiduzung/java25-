/*
��ʾ�ͻ��˺ͷ���ˡ�

1��
�ͻ��ˣ��������
����ˣ��Զ��塣

2,
�ͻ��ˣ��������
����ˣ�Tomcat��������

3,
�ͻ��ˣ��Զ���
����ˣ�Tomcat��������

*/
import java.net.*;
import java.io.*;

class  ServerDemo
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(11000);

		Socket s=ss.accept();
		System.out.println(s.getInetAddress().getHostAddress());

		InputStream in=s.getInputStream();

		byte[] buf=new byte[1024];

		int len=in.read(buf);

		System.out.println(new String(buf,0,len));

		PrintWriter out=new PrintWriter(s.getOutputStream(),true);

		out.println("<font color='red' size='7'>�ͻ������</font>");

		s.close();
		ss.close();
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