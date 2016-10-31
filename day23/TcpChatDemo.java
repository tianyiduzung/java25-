

import java.io.*;
import java.net.*;

class  TcpChatClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("192.168.1.126",10007);
		
		//�����ȡ�������ݵ�������
		BufferedReader bufr=
			new BufferedReader(new InputStreamReader(System.in));
		
		//����Ŀ�ģ�������д�뵽Socket����������͸������
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		
		//����һ��Socket��ȡ������ȡ����˷��ص����ݡ�
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
		
		//Ŀ�ġ�Socket�������������д�뵽Socket������������͸��ͻ��ˡ�	
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		
		//��ȡSocket��ȡ���е�����
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
