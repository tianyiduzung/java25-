/*
Arrays:���ڲ������ݵĹ����ࡣ
���涼�Ǿ�̬������

asList:��������list���ϡ�
*/


import java.util.*;
class  ArraysDemo
{
	public static void main(String[] args) 
	{
//		int[] arr={2,4,5};
//		System.out.println(Arrays.toString(arr));
		
		String[] arr={"abc","cc","kkkk"};


		//��������list������ʲô�ô���
		/*
		����ʹ�ü��ϵ�˼��ͷ��������������е�Ԫ�ء�

		ע�⣺�������ɼ��ϣ�������ʹ�ü��ϵ���ɾ������
		��Ϊ����ĳ����ǹ̶��ġ�

		�����ɾ�ˣ���ô�ᷢ��UnsupportedOperationException��
		*/
		List<String> list=Arrays.asList(arr);
		//sop("contains:"+list.contains("cc"));
		//list.add("qq");//UnsupportedOperationException

		//sop(list);

		//int[] nums={2,4,5};
		Integer[] nums={2,3,4};

		List<Integer> li=Arrays.asList(nums);
		
		/*
		��������е�Ԫ�ض��Ƕ�����ô��ɼ���ʱ�������е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ�ء�
		��������е�Ԫ�ض��ǻ����������ͣ���ô�Ὣ��������Ϊ�����е�Ԫ�ش��ڡ�
		
		*/

		sop(li);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
