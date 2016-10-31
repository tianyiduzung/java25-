
import java.net.*;
class  URLDemo
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url=new URL("http://192.168.1.126:8080/myweb/demo.html?name=haha&age=30");

		System.out.println("getProtocol():"+url.getProtocol());//获取协议名称
		System.out.println("getHost():"+url.getHost());//获取此URL的主机名
		System.out.println("getPort():"+url.getPort());//获取端口号
		System.out.println("getPath():"+url.getPath());//获取路径
		System.out.println("getFile():"+url.getFile());//获取文件名
		System.out.println("getQuery():"+url.getQuery());//获取查询部
	}
}
