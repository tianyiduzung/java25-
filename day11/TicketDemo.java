
/*
���󣺼򵥵���Ʊ����
�������ͬʱ��Ʊ��

�����̵߳ĵڶ��ַ�ʽ��ʵ��Runable�ӿ�

���裺
1��������ʵ��Runnable�ӿ�
2������Runnable�ӿ��е�run������
	���߳�Ҫ���еĴ������ڸ�run�����С�

3��ͨ��Thread�ཨ���̶߳���
4����Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
	ΪʲôҪ��Runnable�ӿڵ����ഫ�ݸ�Thread�Ĺ��캯����
	��Ϊ���Զ����run���������Ķ�����Runnable�ӿڵ��������
	����Ҫ���߳�ȥִ��ָ�������run�������ͱ�����ȷ��run���������Ķ���

5������Thread���start���������̲߳�����Runnable�ӿ������run������


ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô������?

ʵ�ַ�ʽ�ĺô��������˵��̳еľ����ԡ�
�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��

���ַ�ʽ����
�̳�Thread���̴߳�������Thread�����run�����С�
ʵ��Runnable���̴߳�����ڽӿڵ������run�����С�

*/

class Ticket implements Runnable //extends Thread
{
	private static int tick=100;
	public void run()
	{
		while(true)
		{
			if(tick>0)
			{
				System.out.println(Thread.currentThread().getName()+"sale:"+tick--);
			}
		}
	}
}

class  TicketDemo
{
	public static void main(String[] args) 
	{
		Ticket t=new Ticket();

		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();


		/*
		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		*/
	}
}
