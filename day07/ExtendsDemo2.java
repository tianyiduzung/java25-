/*
�Ӹ�����ֺ����Ա���ص㣺

���г�Ա��
1.����
2.����
3�����캯��

1.����
��������г��ַ�˽�е�ͬ����Ա����������Ҫ���ʱ����еı�������this��
����Ҫ���ʸ����е�ͬ������ʱ����super��

super��ʹ�ú�this��ʹ�ü���һ��
this������Ǳ����������á�
super������Ǹ����������á�

 
*/

class Fu
{
	int num=4;
}

class Zi extends Fu
{
	int num=5;
	void show()
	{
		System.out.println(super.num);
	}
}

class ExtendsDemo2
{
	public static void main(String[] arr)
	{
		Zi z=new Zi();
		z.show();
		//System.out.println(z.num+"..."+z.num);
	}
}







