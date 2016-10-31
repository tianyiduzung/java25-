
import java.net.*;
import java.io.*;
class IPDemo2
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader bufr=
			new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while ((line=bufr.readLine())!=null)
		{
			InetAddress ia=InetAddress.getByName(line);
			System.out.println("address:"+ia.getHostAddress());
			System.out.println("name:"+ia.getHostName());

		}
	}
}
