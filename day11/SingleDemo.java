
/*
单例设计模式。

*/

//饿汉式
/*
class Single
{
	private static final Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}

*/


//懒汉式

class Single
{
	private static Singel s=null;
	private Single(){}
	public static Single getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class)
			{
				if(s==null)
				s=new Singel();	
			}
		}
		return s;
	}
}


class  SingelDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
