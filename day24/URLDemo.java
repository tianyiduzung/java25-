
import java.net.*;
class  URLDemo
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url=new URL("http://192.168.1.126:8080/myweb/demo.html?name=haha&age=30");

		System.out.println("getProtocol():"+url.getProtocol());//��ȡЭ������
		System.out.println("getHost():"+url.getHost());//��ȡ��URL��������
		System.out.println("getPort():"+url.getPort());//��ȡ�˿ں�
		System.out.println("getPath():"+url.getPath());//��ȡ·��
		System.out.println("getFile():"+url.getFile());//��ȡ�ļ���
		System.out.println("getQuery():"+url.getQuery());//��ȡ��ѯ��
	}
}
