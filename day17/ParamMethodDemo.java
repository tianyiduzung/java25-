/*
JDK1.5�汾���ֵ������ԡ�

�����Ŀɱ������
��ʹ��ʱע�⣺�ɱ����һ��Ҫ�����ڲ����б�����档
*/


class  ParamMethodDemo
{
	public static void main(String[] args) 
	{
		/*
		//��Ȼ�ٶ����˶��������
		����ÿ�ζ�Ҫ����һ�����顣��Ϊʵ�ʲ�����

		int[] arr={3,4};
		show(arr);
		*/


		/*
		�ɱ������
		��ʵ������һ����������ļ�д��ʽ��
		����ÿһ�ζ��ֶ��Ľ����������
		ֻҪ��Ҫ������Ԫ����Ϊ�������ݼ��ɡ�
		��ʽ����Щ������װ�������顣
		
		*/
		show("haha",2,3,4,5);
	}

	public static void show(String str,int... arr)
	{
		sop(arr.length);
	}

	/*
	public static void show(int[] arr)
	{
		
	}
	*/


	/*
	public static void show(int a,int b)
	{
		sop(a+","+b);
	}
	*/

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
