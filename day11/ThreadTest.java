/*
��ϰ��
���������̣߳������߳̽������С�

ԭ���̶߳����Լ���Ĭ�ϵ����ơ�
Thread-���  �ñ�Ŵ�0��ʼ

static Thread currentThread():��ȡ��ǰ�̶߳���
getName():��ȡ�߳����ơ�

�����߳����ƣ�setName���߹��캯����

*/

class Test extends Thread
{
	public void run()
	{
		for(int x=0;x<60;x++)
		{
			System.out.println("test run..."+x);
		}
	}
}




class  ThreadTest
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Test t2=new Test();
		t1.start();
		t2.start();
		for(int x=0;x<60;x++)
		{
			System.out.println("main..."+x);
		}
	}
}
