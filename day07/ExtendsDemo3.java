/*

2.�����еĺ���
��������ֺ͸���һģһ���ĺ���ʱ��
�����������øú���ʱ�����������ຯ�������ݣ���ͬ����ĺ���������һ��
��������Ǻ�������һ�����ԣ���д�����ǣ���

������̳и��࣬��Ϯ�˸���Ĺ��ܵ������У�
����������߱��ù��ܣ����ܵ�����ȴ�͸��಻һ�¡�
��ʱ��û�б�Ҫ�����¹��ܣ�����ʹ�ø������⣬��������Ĺ��ܶ��壬����д�������ݡ�

���ǣ�
1.���า�Ǹ��࣬���뱣֤����Ȩ�޴��ڵ��ڸ���Ȩ�ޣ��ſ��Ը��ǣ��������ʧ�ܡ�
2.��ֻ̬�ܸ��Ǿ�̬��

��ס��
���أ�ֻ��ͬ�������Ĳ����б�
��д���Ӹ��෽��Ҫһģһ����
*/

class Fu
{
	void show()
	{
		System.out.println("fu show");
	}
	void speak()
	{
		System.out.println("vb");
	}
}

class Zi extends Fu
{
	void speak()
	{
		System.out.println("java");
	}
	void show()
	{
		System.out.println("zi show");
	}
}

class ExtendsDemo3
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		z.speak();
	}
}









