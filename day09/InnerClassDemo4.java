/*
�����ڲ��ࡣ
1,�����ڲ�����ʵ�����ڲ���ļ�д��ʽ��
2�������������ǰ�⣺
	�ڲ������̳�һ�������ʵ�ֽӿڡ�
3,�����ڲ���ĸ�ʽ��new������߽ӿ�(){�������������}
4����ʵ�����ڲ������һ������������󡣶�����������е��֣��������Ϊ�����ݵĶ���
5�������ڲ����ж���ķ�����ò�Ҫ����3����

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
		//d.abc();//������ʧ�ܡ��˴������ã������в�����adc����


	}

}


class  InnerClassDemo4
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}
