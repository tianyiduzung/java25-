
/*
�쳣�����ǳ���������ʱ���ֲ����������
�쳣����������Ҳ����ʵ������һ����������Ҳ����ͨ��java�������ʽ��������������װ�ɶ���
			��ʵ����java�Բ������������������Ķ������֡�

��������Ļ��֣����֣�һ�������ص����⣬һ���Ƿ����ص����⡣

�������صģ�javaͨ��Error�����������
	����Errorһ�㲻��д����ԵĴ��������д���

���ڷ����صģ�javaͨ��Exception�����������
	����Exception����ʹ������ԵĴ���ʽ���д���

����Error����Exception


2���쳣�Ĵ���
java�ṩ�����е������д���
try
{
	��Ҫ�����Ĵ���;
}
catch(�쳣�� ����)
{
	�����쳣�Ĵ���;(����ʽ)
}
finally
{
	һ����ִ�е����;
}


3���Բ��񵽵��쳣������г�������������
	String getMessage()����ȡ�쳣��Ϣ��

�ں����������쳣��
������߰�ȫ�ԣ��õ��ó����д������������ʧ�ܡ�

�Զ��쳣�Ĵ���
1�������쳣ʱ������������Ϊ������쳣����������Ŀ��Ը����塣
2���Է����������쳣���Ͷ�Ӧ�м���catch�顣��Ҫ��������catch�顣
	������catch���е��쳣���ּ̳й�ϵ�������쳣catch����������档

�����ڽ���catch����ʱ��catch��һ��Ҫ������崦��ʽ��
��Ҫ�򵥶���һ��e.printStackTrace();
Ҳ��Ҫ�򵥵ľ�дһ�������䡣

*/
class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ�������⡣
	{
		int[] arr=new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}




class ExceptionDemo1
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try{
			int x=d.div(4,1);
			System.out.println("x="+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("��������");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("�Ǳ�Խ������");
		}

		System.out.println("over");
	}
}
