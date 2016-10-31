
import java.io.*;
class Person implements Serializable
{
	public static final long serialVersionUID=42L;
	private String name;
	transient int age;//添加transient后，age不能再被实例化
	static String country="cn";//静态也不能被实例化
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