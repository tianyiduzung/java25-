
import java.util.*;
import java.text.*;
class  DateDemo
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d);//��ӡ��ʱ�俴������ϣ����Щ��ʽ��

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� E hh:mm:ss");

		//����format������ģʽ��ʽ��ָ��Date����
		String time=sdf.format(d);
		System.out.println("time="+time);
	}
}
