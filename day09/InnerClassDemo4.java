/*
匿名内部类。
1,匿名内部类其实就是内部类的简写格式。
2，定义匿名类的前题：
	内部类必须继承一个类或者实现接口。
3,匿名内部类的格式：new父类或者接口(){定义子类的内容}
4，其实匿名内部类就是一个匿名子类对象。而且这个对象有点胖，可以理解为带内容的对象。
5，匿名内部类中定义的方法最好不要超过3个。

*/
abstract class AbsDemo
{
	abstract void show();
}

class Outer
{
	int x=3;

	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println("show:"+x);
		}
	}
	*/

	public void function()
	{	
		//AbsDemo a=new Inner();
//		new Inner().show();
//		Inner in=new Inner();
//		in.show();

		AbsDemo d=new AbsDemo()
		{
			void show()
			{
				System.out.println("x=="+x);
			}
			void abc()
			{
				System.out.println("haha");			
			}
		};
		d.show();
		//d.abc();//，编译失败。此处不可用，父类中不存在adc方法


	}

}


class  InnerClassDemo4
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}
