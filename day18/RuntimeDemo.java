/*
Runtime����
���ಢû���ṩ���캯����
˵��������new������ô��ֱ���뵽�����еķ������Ǿ�̬�ġ�
���ָ����л��зǾ�̬������
˵������϶����ṩ��һ��������ȡ������󡣶��Ҹ÷����Ǿ�̬�ģ����ҷ���ֵ�����Ǳ������͡�

������ص���Կ�������ʹ���˵������ģʽ��ɡ�

�÷�����static Runtime getRuntime();

*/

class  RuntimeDemo
{
	public static void main(String[] args) throws Exception
	{
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("notepad.exe SystemDemo.java");
		
		//Thread.sleep(4000);
		//p.destroy();
	}
}
