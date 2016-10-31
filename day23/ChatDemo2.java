import java.io.*;
import java.net.*;

class Send implements Runnable
{
	private DatagramSocket ds;
	public Send(DatagramSocket ds)
	{
		this.ds=ds;
	}

	public void run()
	{
		try
		{
			BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));

			String line=null;

			while ((line=bufr.readLine())!=null)
			{		
				byte[] buf=line.getBytes();
				//192.168.1.255是广播发送
				DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.255"),10002);

				ds.send(dp);
				if("over".equals(line))
					break;
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException("发送方失败");
		}
	}
}

class Send2 implements Runnable
{
	private DatagramSocket ds;
	public Send2(DatagramSocket ds)
	{
		this.ds=ds;
	}

	public void run()
	{
		try
		{
			BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));

			String line=null;

			while ((line=bufr.readLine())!=null)
			{				
				byte[] buf=line.getBytes();
				//192.168.1.255是广播发送
				DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.255"),10003);

				ds.send(dp);
				if("over".equals(line))
					break;
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException("发送方失败");
		}
	}
}


class Rece implements Runnable
{
	private DatagramSocket ds;
	public Rece(DatagramSocket ds)
	{
		this.ds=ds;
	}

	public void run()
	{
		try
		{
			while (true)
			{
				byte[] buf=new byte[1024];  
				DatagramPacket dp=new DatagramPacket(buf,buf.length);
				ds.receive(dp);

				String ip=dp.getAddress().getHostAddress();
				String name=dp.getAddress().getHostName();

				String data=new String(dp.getData(),0,dp.getLength());

				System.out.println(name+"::"+ip+"::"+data);
				if("over".equals(data))
					break;
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException("接收失败");
		}
	}
}



class ChatClient
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket sendSocket=new DatagramSocket();
		DatagramSocket receSocket=new DatagramSocket(10003);

		new Thread(new Send(sendSocket)).start();
		new Thread(new Rece(receSocket)).start();
	}
}

class ChatServer
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket sendSocket=new DatagramSocket();
		DatagramSocket receSocket=new DatagramSocket(10002);

		new Thread(new Send2(sendSocket)).start();
		new Thread(new Rece(receSocket)).start();
	}
}
