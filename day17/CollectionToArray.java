/*
���ϱ�����
Collection�ӿ��е�toArray������


*/

import java.util.*;
class CollectionToArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		
		/*
		1.ָ�����͵����鵽��Ҫ����೤�أ�
		��ָ�����͵����鳤��С���˼��ϵ�size����ô�÷����ڲ��ᴴ��һ���µ����飬����Ϊ���ϵ�size��
		��ָ�����͵����鳤�ȴ����˼��ϵ�size���Ͳ����´������顣����ʹ�ô��ݽ��������顣
		���Դ���һ���ոպõ��������š�
		

		2.ΪʲôҪ�����ϱ����飿
		Ϊ���޶���Ԫ�صĲ���������Ҫ������ɾ�ˡ�
		*/
		String[] arr=al.toArray(new String[al.size()]);

		sop(Arrays.toString(arr));

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
