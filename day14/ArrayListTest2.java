import java.util.*;
/*
���Զ��������ΪԪ�ش浽ArrayList�����У���ȥ���ظ�Ԫ�ء�

���磺���˶���ͬ����ͬ���䣬��Ϊͬһ���ˣ�Ϊ�ظ�Ԫ�ء�


˼·��
1�����������������ݷ�װ���˶���
2���������������˴��룬
3��ȡ����

List�����ж�Ԫ���Ƿ���ͬ��������Ԫ�ص�equals������

*/

class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	//�Զ�����equals����
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			return false;

		Person p=(Person)obj;
		System.out.println(this.name+"..."+p.name);
		return this.name.equals(p.name) && this.age==p.age;
	}


	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}


class ArrayListTest2 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new Person("list01",30));
		al.add(new Person("list02",32));
		al.add(new Person("list02",32));
		al.add(new Person("list03",33));
		al.add(new Person("list04",35));
		al.add(new Person("list04",35));
		
		al=singleElement(al);
		Iterator it=al.iterator();
		

		while(it.hasNext())
		{
			Person p=(Person)it.next();
			sop(p.getName()+"::"+p.getAge());
		}
	}
	
	
	public static ArrayList singleElement(ArrayList al)
	{
		//����һ����ʱ����
		ArrayList newAl=new ArrayList();
		Iterator it=al.iterator();

		while(it.hasNext())
		{
			Object obj=it.next();
			
			if(!newAl.contains(obj))
				newAl.add(obj);
		}
		return newAl;
	}
}
