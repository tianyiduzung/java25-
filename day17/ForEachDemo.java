/*
�߼�forѭ��

��ʽ��
for(�������� ���������������ļ���(Collection)��������)
{}


�Լ��Ͻ��б�����
ֻ�ܻ�ȡ�����ǲ��ܶԼ��Ͻ��в�����

���������˱����������Խ���remove������Ԫ�صĶ�����
�������ListIterator,�������ڱ��������жԼ��Ͻ�����ɾ�Ĳ�Ķ�����

��ͳfor�͸߼�for��ʲô�����أ�

�߼�for��һ�������ԣ������б�������Ŀ�ꡣ

�����ڱ��������ʱ�򣬻���ϣ��ʹ�ô�ͳfor����Ϊ��ͳfor���Զ���Ǳꡣ

*/

import java.util.*;
class ForEachDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");


		for(String s:al)
		{
			//s="kk";
			System.out.println(s);
		}

		/*
		Iterator<String> it=al.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		*/

		int[] arr={3,5,1};
		for(int i:arr)
		{
			System.out.println("i:"+i);
		}

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");

		Set<Integer> keySet=hm.keySet();
		for(Integer i:keySet)
		{
			System.out.println(i+"::"+hm.get(i));
		}
		
	//	Set<Map.Entry<Integer,String>> entrySet=hm.entrySet();
	//	for(Map.Entry<Integer,String> me:entrySet)
		for(Map.Entry<Integer,String> me:hm.entrySet())
		{
			System.out.println(me.getKey()+"----"+me.getValue());
		}
	}
}
