/*
������ʽ������һ������ı��ʽ��
	����:����ר�Ų����ַ���
	�ص㣺��һЩ�ض��ķ�������ʾһЩ����������������Լ���д��
		����ѧϰ������ʽ��������ѧϰһЩ������ŵ�ʹ�á�

	�ô������Լ򻯶��ַ����ĸ��Ӳ�����
	�׶ˣ����Ŷ���Խ�࣬����Խ�����Ķ���Խ�

����������ܣ�
1��ƥ�䣺String  matches������

2���иString split();

3,�滻��String replaceAll();

*/


class  RegexDemo
{
	public static void main(String[] args) 
	{
		demo();
		//splitDemo("zhangsan.lisi.wangwu","\\.");
		//splitDemo("c:\\abc\\a.txt","\\\\");

		//splitDemo("sdfwwwfdaaafgqddag","(.)\\1+");//���յ�������иΪ���ù���Ľ��������
												//���Խ������װ��һ���顣��()��ɡ���ĳ��ֶ��б�ţ�
												//��1��ʼ����Ҫʹ�����еĵ������ͨ��\n(n������ı��)����ʽ����ȡ��
		String str="sdfas2353252sa241244dgfasd2dsf2";//���ַ����е������滻��#��
		
		//replaceAllDemo(str,"\\d{5,}","#");

		String str1="sdfwwwwfdaaaafgqddag";//�������滻��&  //���ص�����ĸ�滻�ɵ�����ĸ
		replaceAllDemo(str1,"(.)\\1+","&");
		replaceAllDemo(str1,"(.)\\1+","$1");//$1��˼Ϊ��ǰһ��������ĵ�һ����
	}

	public static void replaceAllDemo(String str,String reg,String newStr)
	{
		str =str.replaceAll(reg,newStr);

		System.out.println(str);
	}


	public static void splitDemo(String str,String reg)
	{
		
		//String reg=" +";//���ն���ո��������и�
		String[] arr=str.split(reg);
		System.out.println(arr.length);
		for(String s:arr)
		{
			System.out.println(s);
		}

	}



	public static void demo()
	{
		String str="b";

		String reg="[bcd]";//�ַ�ֻ����b��c��d����ֻ����һ���ַ�

		boolean b=str.matches(reg);
		System.out.println(b);
	}

	public static void checkQQ()
	{
		String qq="35436421";

		String regex="[1-9][0-9]{4,14}";//��һλ1-9������һλ0-9������4-14��

		boolean flag=qq.matches(regex);
		if(flag)
			System.out.println(qq+"..is ok");
		else
			System.out.println(qq+"..���Ϸ�");
	}

	/*
	��QQ�������У��
	Ҫ��5~15  0���ܿ�ͷ��ֻ��������
	
	���ַ�ʽ��ʹ����String���еķ����������������������󡣵��Ǵ�����ڸ��ӡ�
	*/

	public static void checkQQ_1()
	{
		String qq="1012230799";

		int len=qq.length();

		if(len>=5 && len<=15)
		{
			if(!qq.startsWith("0"))//Integer.parseInt("12a");NumberFormatException
			{
				try
				{
					long l=Long.parseLong(qq);
					System.out.println("qq:"+l);
				}
				catch (NumberFormatException e)
				{
					System.out.println("���ַǷ��ַ�...");
				}


				/*
				char[] arr=qq.toCharArray();
				boolean flag=true;
				for(int x=0;x<arr.length;x++)
				{
					if(!(arr[x]>='0' && arr[x]<='9'))
					{
						flag=false;
						break;
					}	
				}
				if(flag)
				{
					System.out.println("qq:"+qq);
				}
				else
				{
					System.out.println("���ַǷ��ַ�");
				}
				*/
			}
			else
			{
				System.out.println("������0��ͷ");
			}
		}
		else
		{
			System.out.println("���ȴ���");
		}
	}
}
