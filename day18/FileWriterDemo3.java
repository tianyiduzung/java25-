/*
演示对已有文件的续写。

*/

import java.io.*;
class FileWriterDemo3 
{
	public static void main(String[] args) throws IOException
	{
		//传递一个true参数，代表不覆盖已有文件，并在已有文件的末尾处进行数据续写。
		FileWriter fw=new FileWriter("demo.txt",true);

		fw.write("\r\nhaha");

		fw.close();
	}
}
