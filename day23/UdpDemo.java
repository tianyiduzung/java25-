
import java.net.*;

/*
����ͨ��udp���䷽ʽ����һ���������ݷ��ͳ�ȥ��
����udp���Ͷˡ�
˼·��
1������updsocket����
2���ṩ���ݣ��������ݷ�װ�����ݰ��С�
3��ͨ��socket����ķ��͹��ܣ������ݰ�����ȥ��
4���ر���Դ��

*/
class UdpSend 
{
	public static void main(String[] args) throws Exception
	{
		//1,����upd����ͨ��DatagramSocket����
		DatagramSocket ds=new DatagramSocket();

		//2��ȷ�����ݣ�����װ�����ݰ�
		byte[] buf="udp ge men lai le".getBytes();
		DatagramPacket dp=
			new DatagramPacket(buf,buf.length,InetAddress.getByName("112.24.19.61"),10000);
		
		//3,ͨ��socket���񣬽����е����ݰ����ͳ�ȥ��ͨ��send������
		ds.send(dp);

		//4���ر���Դ��
		ds.close();
	}
}

/*
����
����һ��Ӧ�ó������ڽ���udpЭ�鴫������ݲ�����ġ�

����udp�Ľ��նˡ�
˼·��
1������udpsocket����ͨ�������һ���˿ڡ���ʵ���Ǹ������������Ӧ�ó��������ֱ�ʶ��
	��������ȷ��Щ���ݹ�����Ӧ�ó�����Դ���
2������һ�����ݰ�����ΪҪ�洢���յ����ֽ����ݡ�
	��Ϊ���ݰ��������и��๦�ܿ�����ȡ�ֽ������еĲ�ͬ������Ϣ��
3��ͨ��socket�����receive�������յ������ݴ��뵽�Ѷ���õ����ݰ��С�
4��ͨ�����ݰ���������й��ܣ�����Щ��ͬ������ȡ������ӡ�ڿ���̨�ϡ�
5���ر���Դ��

*/

class UdpRece
{
	public static void main(String[] args)throws Exception
	{
		//1������Udp socket�������˵㡣
		DatagramSocket ds=new DatagramSocket(10000);
		
		while(true)
		{
			//2,�������ݰ������ڴ洢���ݡ�
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);

			//3��ͨ�������receive�������յ������ݴ������ݰ��С�
			ds.receive(dp);//����ʽ����

			//4��ͨ�����ݰ��ķ�����ȡ���е����ݡ�
			String ip=dp.getAddress().getHostAddress();
			
			String data=new String(dp.getData(),0,dp.getLength());
			
			int port=dp.getPort();

			System.out.println(ip+"::"+data+"::"+port);

		}

		//5���ر���Դ
		//ds.close();
	}
}
