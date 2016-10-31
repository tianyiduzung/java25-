//将一个文件分割成多个文件存储

import java.io.*;
import java.util.*;
class SplitFile
{
	public static void main(String[] args) throws IOException
	{
		merge();
	}

	public static void merge() throws IOException
	{
		ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();

		for (int x=1;x<=3 ;x++ )
		{
			al.add(new FileInputStream("e:\\splitfiles\\"+x+".part"));
		}

		final Iterator<FileInputStream> it=al.iterator();

		Enumeration<FileInputStream> en=new Enumeration<FileInputStream>()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};

		SequenceInputStream sis=new SequenceInputStream(en);

		FileOutputStream fos=new FileOutputStream("e:\\splitfiles\\0.mp3");
		
		byte[] buf=new byte[1024*1024];

		int len=0;

		while ((len=sis.read(buf))!=-1)
		{
			fos.write(buf,0,len);
		}

		fos.close();
		sis.close();
	}


	public static void splitFile()throws IOException
	{
		FileInputStream fis=new FileInputStream("e:\\1.mp3");

		FileOutputStream fos=null;
		byte[] buf=new byte[1024*1024];

		int len=0;
		int count=1;
		while ((len=fis.read(buf))!=-1)
		{
			fos=new FileOutputStream("e:\\splitfiles\\"+(count++)+".part");
			fos.write(buf,0,len);
			fos.close();
		}

		fis.close();

	}
}
