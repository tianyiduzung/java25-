/*
��̬���������Ϊ������ڵĶ�����̬

1.��̬�Ļ�������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������
2.��̬��ǰ��
	����������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ������һ��ǰ�⣺���ڸ��ǡ�
3.��̬�ĺô�
	��̬�ĳ��ִ�������˳������չ�ԡ�
4.��̬�ı׶ˣ�
	�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��
5.��̬��Ӧ��


*/

class Animal
{
	abstract void eat();
}

class cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanjia()
	{
		System.out.println("����");
	}
}

class DuotaiDemo
{
	public static void main(String[] args)
	{
		Cat c =new Cat();
		c.eat();
	}
}