
/*



*/


/*
class Tool
{
	private Worker w;
	public void setWorker(Worker w)
	{
		this.w=w;
	}
	public Worker getWorker()
	{
		return w;
	}
}
*/

class Worker
{
}

class Student
{
}

//����ǰ����
class Tool
{
	private Object obj;
	public void setObject(Object obj)
	{
		this.obj=obj;
	}
	public Object getObject()
	{
		return obj;
	}
}


//���ͺ�����
/*
ʲôʱ���巺���ࣿ
������Ҫ�����������������Ͳ�ȷ����ʱ��
���ڶ���Object�������չ��
���ڶ��巺���������չ��
*/
class Utils<QQ>
{
	private QQ q;
	public void setObject(QQ q)
	{
		this.q=q;
	}
	public QQ getObject()
	{
		return q; 
	}
}

class  GenericDemo3
{
	public static void main(String[] args) 
	{
		Utils<Worker> w=new Utils<Worker>();
		u.setObject(new Worker());
		Worker w=u.getObject();
		/*
		Tool t=new Tool();
		t.setObject(new Worker());
		Worker w=(Worker)t.getObject();
		*/
	}
}
