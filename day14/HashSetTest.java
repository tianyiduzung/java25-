import java.util.*;
/*
往hashSet集合中存入自定义对象
姓名和年龄相同为同一个人，重复元素。

*/

class HashSetTest
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();

		hs.add(new Person("a1",11));
		hs.add(new Person("a2",12));
		hs.add(new Person("a2",12));
		hs.add(new Person("a3",13));
//		hs.add(new Person("a4",14));

//		sop("a1:"+hs.contains(new Person("a1",11)));

		hs.remove(new Person("a3",13));

		Iterator it=hs.iterator();

		while(it.hasNext())
		{
			Person p=(Person)it.next();
			sop(p.getName()+"::"+p.getAge());
		}
				
	}
}


class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	//为了让存入时进行比较(哈希值都相同，所以要进行比较是否为同一对象)
	public int hashCode()
	{
		//System.out.println(this.name+"...hashCode");
		return name.hashCode()+age*23;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			return false;

		Person p=(Person)obj;
		//System.out.println(this.name+"..."+p.name);
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
