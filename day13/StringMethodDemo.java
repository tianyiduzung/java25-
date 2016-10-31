/*
String�������������ַ������
��ô�����ṩ�˶���������ַ������в�����

�����Ĳ�������Щ��
"abcd"

1,��ȡ
	1.1 �ַ����а������ַ�����Ҳ�����ַ������ȡ�
		int length():��ȡ����
	1.2 ����λ�û�ȡλ���ϵ�ĳ���ַ���
		char charAt(int index):��ȡĳһλ���ϵ��ַ�
	1.3 �����ַ���ȡ���ַ����ַ����е�λ��
		int indexOf(int ch):���ص�ch�����ַ����е�һ�γ��ֵ�λ�á�
		int indexOf(int ch,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�á�

		int indexOf(String str):���ص�str�����ַ����е�һ�γ��ֵ�λ�á�
		int indexOf(String srt,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����г��ֵ�λ�á�

		int lastIndexOf(int ch):���ص���ch���������ַ����е�λ��

2,�ж�
	2.1 �ַ������Ƿ����ĳһ���Ӵ�
		boolean contains(str);
		����֮����indexOf(str):��������str��һ�γ���λ�ã��������-1����ʾ��str���ַ����в�����
				���ԣ�Ҳ�������ڶ�ָ���ַ������ж��Ƿ������
				if(str.indexOf("aa")!=-1)

				���Ҹ÷����ȿ����жϣ�Ҳ���Ի�ȡ���ֵ�λ�á�

	2.2 �ַ������Ƿ�������
		boolean isEmpty(); ԭ������жϳ����Ƿ�Ϊ0
	2.3 �ַ����Ƿ�����ָ�����ݿ�ͷ
		boolean startsWith(str);
	2.4 �ַ����Ƿ�����ָ�����ݽ�β
		boolean endsWith(str);
	2.5 �ж��ַ��������Ƿ���ͬ����д��Object���е�equals����
		boolean equals(str);
	2.6 �ж������Ƿ���ͬ�������Դ�Сд��
		boolean equalsIgnoreCase();

3,ת��
	3.1 ���ַ�����ת���ַ���
		���캯����String(char[])
				  String(char[],offset,count):���ַ�������һ����ת���ַ���

		��̬������
				static String copyValueOf(char[]);
				static String copyValueOf(char[] data,int offset,int count);

				static String valueOf(char[])
	3.2 ���ַ���ת���ַ�����
			char toCharArray();	


	3.3 ���ֽ�����ת���ַ���
				String(byte[])
				String(byte[],offset,count):���ֽ�������һ����ת���ַ���
	3.4 ���ַ���ת���ֽ�����
			byte[] getBytes();
	3.5 ��������������ת���ַ���
		static String valueOf(int)
		static String valueOf(double)

		//3+"";��ͬ�� //String valueOf(3);  //����3���Ͽ��ַ������Զ�ת�����ַ���


		���⣺�ַ������ֽ�������ת�������У��ǿ���ָ�������ġ�

4.�滻
	String replace(oldchar,newchar);

5.�и�
	String[] split(regex);

6,�Ӵ�����ȡ�ַ����е�һ����
	String substring(begin);
	String substring(begin,end);


7��ת����ȥ���ո񣬱Ƚ�
	7.1 ���ַ���ת���ɴ�д��Сд��
		String toUpperCase();
		String toLowerCase();

	7.2 ���ַ������˵Ķ���ո�ȥ��
		String trim();

	7.3 �������ַ���������Ȼ˳��ıȽ�
		int compareTo(string);
		�൱�ڱȽ��ַ�����С

*/



class StringMethodDemo 
{
	public static void method_7()
	{
		String s="     Hello java   ";
		sop(s.toLowerCase());
		sop(s.toUpperCase());
		sop(s.trim());

		String s1="adc";
		String s2="aaa";
		sop(s1.compareTo(s2));
	}



	public static void method_sub()
	{
		String s="abcdef";
		sop(s.substring(2));//��ָ��λ�õ���β������Ǳ겻���ڣ�������ַ����Ǳ�Խ���쳣
		sop(s.substring(2,4));//����ͷ��������β
	}


	public static void method_split()
	{
		String s="zhangsan,lisi,wangwu";
		String[] arr=s.split(",");
		for(int x=0;x<arr.length;x++)
		{
			sop(arr[x]);
		}
	}



	public static void method_replace()
	{
		String s="hello java";
		String s1=s.replace('a','n');//���Ҫ�滻���ַ������ڣ��򷵻ص��ַ������䡣
		String s2=s.replace("java","world");
		sop("s="+s);
		sop("s1="+s1);
		sop("s2="+s2);
	}



	public static void method_trans()
	{
		char [] arr={'a','b','c','d','e','f'};
		String s=new String(arr,1,3);
		sop("s="+s);

		String s1="adfdgrge";
		char[] chs=s1.toCharArray();
		for(int x=0;x<chs.length;x++)
		{
			sop("ch="+chs[x]);
		}
	}




	public static void method_is()
	{
		String str="ArrayDmeo.java";

		//�ж��ļ����Ƿ���Array���ʿ�ͷ
		sop(str.startsWith("Array"));
		//�ж��ļ����Ƿ���.java���ļ�
		sop(str.endsWith(".java"));
		//�ж��ļ����Ƿ����Demo
		sop(str.contains("Demo"));
	}



	public static void method_get()
	{
		String str="abcdeakpf";

		//����
		sop(str.length());

		//����������ȡ�ַ�
		sop(str.charAt(4));//�����ʵ��ַ����в����ڵĽǱ�ʱ�ᷢ��StringIndexOutOfBoundsException

		//�����ַ���ȡ����
		sop(str.indexOf('m',3));//���û���ҵ�������-1

		//��������һ���ַ����ֵ�λ��
		sop(str.lastIndexOf("a"));

	}



	public static void main(String[] args) 
	{

		method_7();
//		method_sub();
//		method_split();
//		method_replace();
//		method_trans();
//		method_is();
//		method_get();
		/*
		String s1="abc";
		String s2=new String("abc");
		String s3="abc";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		*/
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
