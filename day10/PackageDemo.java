
package pack;
/*
Ϊ�˼���������д��ʹ��һ���ؼ��֣�import��
import ������ǰ��е��ࡣ
���鲻Ҫдͨ��� * ����Ҫ�õ����е��ĸ��࣬�͵����ĸ��ࡣ


���鶨�������Ҫ�ظ�������ʹ��url����ɶ��壬url��Ψһ�ġ�

www.itcast.cn

package cn.itcast.demo

*/
import packa.*;//��packb�е������ർ�룬�����������ļ���
import packb.*;

 class PackageDemo 
{
	public static void main(String[] args) 
	{
		//packa.DemoA d=new packa.DemoA();
		DemoA d=new DemoA();
		d.show();
		//packb.DemoB b=new packb.DemoB();
		//b.method();
	}
}

/*
------------------------------------------
PackageDemo.java:9: ����: �Ҳ�������
                DemoA d=new DemoA();
                ^
  ����:   �� DemoA
  λ��: �� PackageDemo
PackageDemo.java:9: ����: �Ҳ�������
                DemoA d=new DemoA();
                            ^
  ����:   �� DemoA
  λ��: �� PackageDemo
2 ������

����ԭ������д��
��Ϊ������ȫ���ǣ�����.����

--------------------------------------------

PackageDemo.java:8: ����� packa ������
				packa.DemoA d=new packa.DemoA();

PackageDemo.java:8: ����� packa ������
				packa.DemoA d=new packa.DemoA();

2 ����


����ԭ��packa�����ڵ�ǰĿ¼��
��Ҫ����classpath������jvmȥ������ָ����packa����

-----------------------------------------------------

PackageDemo.java:9: ����: DemoA��packa�в��ǹ�����; �޷����ⲿ������ж�����з�
��
                packa.DemoA d=new packa.DemoA();
                     ^
PackageDemo.java:9: ����: DemoA��packa�в��ǹ�����; �޷����ⲿ������ж�����з�
��
                packa.DemoA d=new packa.DemoA();
                                       ^
2 ������


����ԭ�����˰�����Χ���һ�����е���Ҫ�����ʣ�����Ҫ���㹻���Ȩ�ޡ�
���Ա����ʵ���Ҫ��public���Ρ�

---------------------------------------------------------

PackageDemo.java:9: show() �� packa.DemoA �в��ǹ����ģ��޷����ⲿ������ж����
�з���
				d.show();

1 ����

����ԭ���๫�к󣬱����ʵĳ�ԱҲҪ���вſ��Ա����ʡ�

----------------------------------------------------------


�ܽ᣺
	�����֮����з��ʣ������ʵİ��е����Լ����еĳ�Ա����Ҫpublic���Ρ�

	��ͬ���е��������ֱ�ӷ��ʸ����б�protectedȨ�����εĳ�Ա��

�����֮�����ʹ�õ�Ȩ��ֻ�����֣�public  protected��


			  public	protected	default	  private
ͬһ������		ok			ok			ok		ok		
ͬһ������		ok			ok			ok
����			ok			ok
��ͬ����		ok








*/