
/*
�쳣���Ӹ��า���е����֣�
1�������ڸ��Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ�����ֻ���׳�������쳣���߸��쳣�����ࡣ
2,������෽���׳�����쳣����ô�����ڸ��Ǹ÷���ʱ��ֻ���׳������쳣���Ӽ���
3�����������߽ӿڵķ�����û���쳣�׳�����ô�����ڸ����쳣ʱ��Ҳ�������׳��쳣��
	������෽���������쳣���ͱ������try�������Բ����ס�

*/

class AException extends Exception
{
}

class BException extends AException
{
}
class CException extends Exception
{
}

class Fu
{
	void show()throws AException
	{
	
	}
}

class Test
{
	void function(Fu f)
	{
		try
		{
			f.show();
		}
		catch (AException e)
		{
		}
	
	}
}

class Zi extends Fu
{
	void show()throws AException
	{
	
	}
}

class ExceptionDemo5 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.function(new Fu());
	}
}
