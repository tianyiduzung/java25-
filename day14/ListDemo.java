/*
Collection
	|--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
		|--ArrayList:�ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ٶȺܿ죬������ɾ�������̲߳�ͬ����
		|--LinkedList���ײ�ʹ�õ����������ݽṹ���ص㣺��ɾ�ٶȺܿ죬��ѯ������
		|--Vector���ײ����������ݽṹ���߳�ͬ������ArrayList�����
	|--Set: Ԫ��������ģ�Ԫ�ز������ظ���


List:
	���з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ�����

��
	add(index,element);
	addAll(index,Collection);

ɾ
	remove(index);

��
	set(index,element);

��
	get(index);
	subList(from,to);
	listIterator();



List�������еĵ�������ListIterator��Iterator���ӽӿڡ�
�ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�ء�
��Ϊ�ᷢ��ConcurrentModificationException�쳣��

���ԣ��ڵ���ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator�ķ��������޵ģ�
ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ�����
�����Ҫ�����Ĳ�������ӣ��޸ĵȣ�����Ҫʹ�����ӽӿڣ�ListIterator��

�ýӿ�ֻ��ͨ��List���ϵ�listIterator������ȡ��

*/

import java.util.*;



class ListDemo 
{

	public static void method()
	{
		ArrayList al=new ArrayList();

		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");

		sop("ԭ�����ǣ�"+al);

		//��ָ��λ�����Ԫ��
		al.add(1,"java09");

		//ɾ��ָ��λ�õ�Ԫ��
		//al.remove(2);

		//�޸�Ԫ��
		al.set(2,"java007");

		//ͨ���Ǳ��ȡԪ��
		sop("get(1):"+al.get(1));

		sop(al);

		//��ȡ����Ԫ��
		for(int x=0;x<al.size();x++)
		{
			sop("al("+x+")="+al.get(x));
		}

		Iterator it=al.iterator();
		while(it.hasNext())
		{
			sop("next:"+it.next());
		}

		//ͨ��indexOf��ȡ�����λ��
		sop("index="+al.indexOf("java03"));

		List sub=al.subList(1,3);
		sop("sub="+sub);
	}



	public static void main(String[] args) 
	{
		//��ʾ�б������
		ArrayList al=new ArrayList();

		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		sop(al);

		ListIterator li=al.listIterator();
		while (li.hasNext())
		{
			Object obj=li.next();
			if(obj.equals("java02"))
				//li.add("java009");
				li.set("java006");
		}
		
		while(li.hasPrevious())
		{
			sop("pre:"+li.previous());
		}
		//sop("hasNext():"+li.hasNext());
		//sop("hasPrevious():"+li.hasPrevious());
		sop(al);


		/*
		//�ڵ��������У�׼����ӻ���ɾ��Ԫ�ء�
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals("java02"))
				//al.add("java008");
				it.remove();//��java02�����ôӼ�����ɾ���ˡ�

			sop("obj="+obj);
		}
		sop(al);
		*/

		
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
