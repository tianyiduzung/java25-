/*
StaticImport ��̬���롣

����������ʱ����Ҫָ������İ�����
����������ʱ��ָ���߱������Ķ�������ࡣ
*/


import java.util.*;
import static java.util.Arrays.*;//�������Arrays������е����о�̬��Ա��
import static java.lang.System.*;//������System�������о�̬��Ա��
class StaticImport 
{
	public static void main(String[] args) 
	{
		out.println("haha");
		int[] arr={3,1,5};

		sort(arr);
		int index=binarySearch(arr,1);
		sop(Arrays.toString(arr));
		sop("Index="+index);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
