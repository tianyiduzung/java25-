/*
�ӿڣ�������⣬������Ϊ��һ������ĳ�����
	���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
class���ڶ�����
interface���ڶ���ӿڡ�

�ӿڶ���ʱ����ʽ�ص㣺
1.�ӿ��г������壺���������󷽷���
2.�ӿ��еĳ�Ա���й̶����η���
	������public static final
	������public abstract
��ס���ӿ��еĳ�Ա����public�ġ�

�ӿڣ��ǲ����Դ�������ģ���Ϊ�г��󷽷���
��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ������
����������һ�������ࡣ

�ӿڿ��Ա����ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��java֧�ֶ�ʵ�֡�
*/

interface Inter
{
	public static final int NUM=3;
	public abstract void show();

}

interface InterA
{
	public abstract void show();
}

class Test implements Inter,InterA   //�ӿ�����֮����ʵ�ֹ�ϵ
{
	public void show(){}
}

interface A
{
}
interface B
{
}
class InterfaceDemo
{
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println("t.NUM");
		System.out.println("Test.NUM");
		System.out.println("Inter.NUM");
		
	}
}
