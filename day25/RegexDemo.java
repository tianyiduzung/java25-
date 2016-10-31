/*
正则表达式：符合一定规则的表达式。
	作用:用于专门操作字符串
	特点：用一些特定的符号来表示一些代码操作。这样可以简化书写。
		所以学习正则表达式，就是在学习一些特殊符号的使用。

	好处：可以简化对字符串的复杂操作。
	弊端：符号定义越多，正则越长，阅读性越差。

具体操作功能：
1，匹配：String  matches方法。

2，切割：String split();

3,替换：String replaceAll();

*/


class  RegexDemo
{
	public static void main(String[] args) 
	{
		demo();
		//splitDemo("zhangsan.lisi.wangwu","\\.");
		//splitDemo("c:\\abc\\a.txt","\\\\");

		//splitDemo("sdfwwwfdaaafgqddag","(.)\\1+");//按照叠词完成切割。为了让规则的结果被重用
												//可以将规则封装成一个组。用()完成。组的出现都有编号，
												//从1开始。想要使用已有的的组可以通过\n(n就是组的编号)的形式来获取。
		String str="sdfas2353252sa241244dgfasd2dsf2";//将字符串中的数组替换成#。
		
		//replaceAllDemo(str,"\\d{5,}","#");

		String str1="sdfwwwwfdaaaafgqddag";//将叠词替换成&  //将重叠的字母替换成单个字母
		replaceAllDemo(str1,"(.)\\1+","&");
		replaceAllDemo(str1,"(.)\\1+","$1");//$1意思为拿前一个规则里的第一个组
	}

	public static void replaceAllDemo(String str,String reg,String newStr)
	{
		str =str.replaceAll(reg,newStr);

		System.out.println(str);
	}


	public static void splitDemo(String str,String reg)
	{
		
		//String reg=" +";//按照多个空格来进行切割
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

		String reg="[bcd]";//字符只能是b、c、d，且只能是一个字符

		boolean b=str.matches(reg);
		System.out.println(b);
	}

	public static void checkQQ()
	{
		String qq="35436421";

		String regex="[1-9][0-9]{4,14}";//第一位1-9，后面一位0-9随便出现4-14次

		boolean flag=qq.matches(regex);
		if(flag)
			System.out.println(qq+"..is ok");
		else
			System.out.println(qq+"..不合法");
	}

	/*
	对QQ号码进行校验
	要求：5~15  0不能开头，只能是数字
	
	这种方式，使用了String类中的方法，进行了组合完成了需求。但是代码过于复杂。
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
					System.out.println("出现非法字符...");
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
					System.out.println("出现非法字符");
				}
				*/
			}
			else
			{
				System.out.println("不可以0开头");
			}
		}
		else
		{
			System.out.println("长度错误");
		}
	}
}
