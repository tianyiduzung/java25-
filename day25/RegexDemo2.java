/*
������ʽ�ĵ��ĸ�����
4����ȡ�����ַ����еķ��Ϲ�����ִ�ȡ����

�������裺
1����������ʽ��װ�ɶ���
2������������Ҫ�������ַ����������
3�������󣬻�ȡ����ƥ�����档
4��ͨ������Է��Ϲ�����ִ����в���������ȡ����

*/

import java.util.regex.*;
class  RegexDemo2
{
	public static void main(String[] args) 
	{
		getDemo();
	}	
	public static void getDemo()
	{
		String str="ming tian jiu yao fang jia le,da jia";

		String reg="\\b[a-z]{3}\\b";

		//�������װ�ɶ���
		Pattern p=Pattern.compile(reg);

		//����������Ҫ�������ַ������������ȡƥ��������
		Matcher m=p.matcher(str);

		//System.out.println(m.matches());//��ʵString���е�matches�������õľ���Pattern��Matcher��������ɵġ�
										//ֻ������String�ķ�����װ���������Ƚϼ򵥣����ǹ���ȴ��һ��
		
//		boolean b=m.find();//���������õ��ַ����ϣ������з��Ϲ�����ִ����ҡ�
//		System.out.println(b);
//		System.out.println(m.group());//���ڻ�ȡƥ�������

		while (m.find())
		{
			System.out.println(m.group());
			System.out.println(m.start()+"..."+m.end());
		}
	}
}
