/*
集合框架的工具类。
Collections：

*/

import java.util.*;
class CollectionsDemo
{
	public static void main(String[] args) 
	{
		binarySearchDemo();
	}


	public static void binarySearchDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("kkkk");
		list.add("qq");
		Collections.sort(list);
		sop(list);

		//int index=Collections.binarySearch(list,"aaa");
		//int index=halfSearch(list,"aaa");
		int index=halfSearch2(list,"aaa",new StrLenComparator());
		sop("index="+index);
	}

	public static int halfSearch(List<String> list,String key)
	{
		int max,min,mid;
		max=list.size()-1;
		min=0;

		while (min<=max)
		{
			mid=(max+min)>>1;//  /2
			String str=list.get(mid);
			int num=str.compareTo(key);
			if(num>0)
				max=mid-1;
			else if(num<0)
				min=mid+1;
			else
				return mid;
		}
		return -min-1;
	}

	public static int halfSearch2(List<String> list,String key,Comparator<String> cmp)
	{
		int max,min,mid;
		max=list.size()-1;
		min=0;

		while (min<=max)
		{
			mid=(max+min)>>1;//  /2
			String str=list.get(mid);

			int num=cmp.compare(str,key);
			if(num>0)
				max=mid-1;
			else if(num<0)
				min=mid+1;
			else
				return mid;
		}
		return -min-1;
	}

	public static void maxDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("kkkk");
		list.add("qq");
		Collections.sort(list);
		sop(list);
		String max=Collections.max(list);
		sop("max="+max);
	}

	public static void sortDemo()
	{
		List<String> list=new ArrayList<String>();

		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("kkkk");
		list.add("qq");

		sop(list);

		//Collections.sort(list);
		Collections.sort(list,new StrLenComparator());

		sop(list);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

class StrLenComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}