/*
���Ͽ��
Ϊʲô�������ô��������أ�
��Ϊÿһ�����������ݵĴ洢��ʽ���в�ͬ��
����洢��ʽ��֮Ϊ�����ݽṹ��

*/

/*
1,add�����Ĳ���������Object���Ա��ڽ����������Ͷ���

2�������д洢�Ķ��Ƕ��������(��ַ)


ʲô�ǵ�������
��ʵ���Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ��



�Ͱ�ȡ����ʽ�����ڼ��ϵ��ڲ���
����ȡ����ʽ�Ϳ���ֱ�ӷ��ʼ����ڲ���Ԫ�ء�
��ôȡ����ʽ�ͱ���������ڲ��ࡣ

��ÿһ�����������ݽṹ��ͬ��
����ȡ���Ķ���ϸ��Ҳ��һ�������Ƕ��й������ݣ�
�����жϺ�ȡ�������Խ���Щ���Գ�ȡ��

��ô��Щ�ڲ��඼����һ�����򡣸ù�����Iterator��
��λ�ȡ���ϵ�ȡ�������أ�
ͨ��һ�������ṩ�ķ�����iterator();
*/


import java.util.*;

class  CollectionDemo
{
	public static void main(String[] args) 
	{
	//	method_2();
		method_get();

		
	}

	public static void method_get()
	{
		ArrayList al=new ArrayList();	
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		/*
		Iterator it=al.iterator();//��ȡ������������ȡ�������е�Ԫ�ء�
		while(it.hasNext())
		{
			sop(it.next());
		}
		*/
		for(Iterator it=al.iterator();it.hasNext();)
		{
			sop(it.next());
		}
	}



	public static void method_2()
	{
		
		ArrayList al1=new ArrayList();	
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		ArrayList al2=new ArrayList();	
		al2.add("java03");
		al2.add("java04");
		al2.add("java05");
		al2.add("java06");

//		al1.retainAll(al2);//ȡ������al1��ֻ�ᱣ����al2����ͬ��Ԫ�ء�
		al2.removeAll(al1);

		sop("al1:"+al1);
		sop("al2:"+al2);
	
	}





	public static void base_method()
	{
		//����һ������������ʹ��Collection�ӿڵ����ࡣArrayList
		ArrayList al=new ArrayList();

		//1,���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//��ӡԭ����
		sop("ԭ����"+al);

		//3,ɾ��Ԫ��
		//al.remove("java02");
		//al.clear();//��ռ���

		//4,�ж�Ԫ��
		sop("java03�Ƿ���ڣ�"+al.contains("java03"));
		sop("�����Ƿ�Ϊ�գ�"+al.isEmpty()); 

		//2,��ȡ���������ϳ��ȡ�
		sop("size:"+al.size());

		//��ӡ�ı��ļ���
		sop(al);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
