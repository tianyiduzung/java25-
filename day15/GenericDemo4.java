
/*
class Demo<T>
{
	public void show(T t)
	{
		System.out.println("show:"+t);
	}
	public void print(T t)
	{
		System.out.println("print:"+t);
	}
}
*/


//�����ඨ��ķ��ͣ�������������Ч�����������ʹ�ã�
//��ô������Ķ�����ȷҪ�����ľ������ͺ�����Ҫ���������;��Ѿ��̶��ˡ�

//Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ����
//��ô���Խ����Ͷ����ڷ����ϡ�

/*
����֮����
��̬���������Է������϶���ķ��͡�
�����̬����������Ӧ���������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�

*/

class Demo<T>
{
	public void show(T t)
	{
		System.out.println("show:"+t);
	}
	public <Q> void print(Q q)
	{
		System.out.println("print:"+q);
	}
	public static <W> void method(W t)
	{
		System.out.println("method"+t);
	}
}

class GenericDemo4 
{
	public static void main(String[] args) 
	{
		Demo <String> d=new Demo<String>();
		d.show("haha");
		d.print(5);	
		d.print("hehe");

		Demo.method("hahaha");
		/*
		Demo d=new Demo();
		d.show("haha");
		d.show(new Integer(4));
		d.print("heihei");	
		*/
		/*
		Demo<Integer> d=new Demo<Integer>();
		d.show(new Integer(4));
		d.print(8);
		*/
	}
}
