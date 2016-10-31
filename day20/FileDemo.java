/*
File类的常见方法：
1，创建。
	boolean createNewFile();在指定文件创建文件，如果该文件已经存在，则不创建，返回false。
							和输出流不一样，输出流对象一建立就会创建文件。而且文件已经存在，会覆盖。

2，删除。
	boolean delete();删除失败返回false。
	void deleteOnExit();在程序退出时删除指定文件。

	boolean mkdir():创建文件夹
	boolean mkdirs():创建多级文件夹。

3，判断。
	boolean exists() :文件是否存在。
	boolean isFile():文件是否存在
	boolean isDirectory():目录是否存在
	isHidden():是否隐藏
	isAbsolute():判断路径是否是绝对路径。

4，获取信息。
	getName();
	getPath(); 获取路径
	getParent();

	getAbsolutePath(); 获取绝对路径
	long lastModified();  最后一次修改的时间
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
		sop("parent:"+f.getParent());//该方法返回的是绝对路径中的父目录。如果获取的是相对路径，返回空。
									//如果相对路径中有上一层目录，那么该目录就是返回结果。
	}

	public static void method_3()throws IOException
	{
		File f=new File("file.txt");

		//f.createNewFile();

		f.mkdir();
		
		//记住：在判断文件对象是否是文件或者目的时，必须要判断该文件对象封装的内容是否存在。
		//通过exists判断。
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());

		sop(f.isAbsolute());
	}

	public static void method_2()
	{
		File f=new File("file.txt");

		sop("exists:"+f.exists());

		//sop("execute:"+f.canExecute());

		//创建文件夹
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

	//创建File对象
	public static void consMethod()
	{
		//将a.txt封装成file对象。可以将已有的和未出现的文件或者文件夹封装成对象。
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
