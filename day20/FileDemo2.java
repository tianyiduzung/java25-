
import java.io.*;

class FileDemo2 
{
	public static void main(String[] args) 
	{
		File dir=new File("c:\\");
		File[] files=dir.listFiles();

		for(File f:files)
		{
			System.out.println(f.getName()+"::"+f.length());
		}

	}

	public static void listDemo2()
	{
		File dir=new File("e:\\");

		String[] arr=dir.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				//System.out.println("dir:"+dir+"...name::"+name);
				/*
				if(name.endsWith(".png"))
					return true;
				else
					return false;
				*/
				return name.endsWith(".mp3");
			}
		});

		System.out.println("len:"+arr.length);

		for(String name:arr)
		{
			System.out.println(name);
		}
	}

	public static void listDemo()
	{
		File f=new File("c:\\");

		String[] names=f.list();//调用list方法的file对象必须是封装了一个目录。该目录还必须存在。
		for (String name:names)
		{
			System.out.println(name);
		}
	}

	public static void listRootsDemo()
	{
		File[] files=File.listRoots();

		for(File f:files)
		{
			System.out.println(f);
		}
	}
}
