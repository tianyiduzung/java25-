/*
�ڲ���ķ��ʹ���
1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�С�
	֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ������ã���ʽ���ⲿ����.this
2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������
3��
*/
class Outer
{
	private int x=3;
	class Inner//�ڲ���
	{
		int x=4;
		void function()
		{
			int x=6;
			System.out.println("inner1:"+x);//���Ϊ6��
			System.out.println("inner2:"+this.x);//���Ϊ4.
			System.out.println("inner3:"+Outer.this.x);//���Ϊ3.
		}
	}

	void method()
	{
		Inner in=new Inner();
		in.function();
	}
}





class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		Outer out=new Outer();
		out.method();

		//ֱ�ӷ����ڲ����еĳ�Ա
//		Outer.Inner in=new Outer().new Inner();
//		in.function();
	}
}
