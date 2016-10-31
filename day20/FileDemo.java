/*
File��ĳ���������
1��������
	boolean createNewFile();��ָ���ļ������ļ���������ļ��Ѿ����ڣ��򲻴���������false��
							���������һ�������������һ�����ͻᴴ���ļ��������ļ��Ѿ����ڣ��Ḳ�ǡ�

2��ɾ����
	boolean delete();ɾ��ʧ�ܷ���false��
	void deleteOnExit();�ڳ����˳�ʱɾ��ָ���ļ���

	boolean mkdir():�����ļ���
	boolean mkdirs():�����༶�ļ��С�

3���жϡ�
	boolean exists() :�ļ��Ƿ���ڡ�
	boolean isFile():�ļ��Ƿ����
	boolean isDirectory():Ŀ¼�Ƿ����
	isHidden():�Ƿ�����
	isAbsolute():�ж�·���Ƿ��Ǿ���·����

4����ȡ��Ϣ��
	getName();
	getPath(); ��ȡ·��
	getParent();

	getAbsolutePath(); ��ȡ����·��
	long lastModified();  ���һ���޸ĵ�ʱ��
	long length();

*/


import java.io.*;
class  FileDemo
{
	public static void main(String[] args) throws IOException
	{
		method_5();
	}

	public static void method_5()
	{
		File f1=new File("c:\\Test.java");
		File f2=new File("c:\\hahah.java");

		sop("rename:"+f1.renameTo(f2));
	}

	public static void  method_4()throws IOException
	{
		File f=new File("file.txt");
		sop("path:"+f.getPath());
		sop("abspath:"+f.getAbsolutePath());
		sop("parent:"+f.getParent());//�÷������ص��Ǿ���·���еĸ�Ŀ¼�������ȡ�������·�������ؿա�
									//������·��������һ��Ŀ¼����ô��Ŀ¼���Ƿ��ؽ����
	}

	public static void method_3()throws IOException
	{
		File f=new File("file.txt");

		//f.createNewFile();

		f.mkdir();
		
		//��ס�����ж��ļ������Ƿ����ļ�����Ŀ��ʱ������Ҫ�жϸ��ļ������װ�������Ƿ���ڡ�
		//ͨ��exists�жϡ�
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());

		sop(f.isAbsolute());
	}

	public static void method_2()
	{
		File f=new File("file.txt");

		sop("exists:"+f.exists());

		//sop("execute:"+f.canExecute());

		//�����ļ���
		File dir=new File("abc");
		
		sop("mkdir:"+dir.mkdir());
	}

	public static void method_1()throws IOException
	{
		File f=new File("file.txt");
		f.deleteOnExit();
		//sop("create:"+f.createNewFile());
		sop("delete:"+f.delete());
	}

	//����File����
	public static void consMethod()
	{
		//��a.txt��װ��file���󡣿��Խ����еĺ�δ���ֵ��ļ������ļ��з�װ�ɶ���
		File f1=new File("c:\\abc\\a.txt");

		//
		File f2=new File("c:\\abc","b.txt");

		File d=new File("c:\\abc");
		File f3=new File(d,"c.txt");

		sop("f1:"+f1);
		sop("f2:"+f2);
		sop("f3:"+f3);

		File f4=new File("c:"+File.separator+"abc"+File.separator+"zzz"+File.separator+"a.txt");
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
