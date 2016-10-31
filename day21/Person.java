
import java.io.*;
class Person implements Serializable
{
	public static final long serialVersionUID=42L;
	private String name;
	transient int age;//���transient��age�����ٱ�ʵ����
	static String country="cn";//��̬Ҳ���ܱ�ʵ����
	Person(String name,int age,String country)
	{
		this.name=name;
		this.age=age;
		this.country=country;
	}

	public String toString()
	{
		return name+":"+age+":"+country;
	}

}