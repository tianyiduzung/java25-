
package mymenu;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class MyMenuTest 
{
	private Frame f;
	private MenuBar bar;
	private TextArea ta;
	private Menu fileMenu;
	private MenuItem openItem,saveItem,closeItem;
	//定义打开和保存对话框
	private FileDialog openDia,saveDia;

	private File file;

	MyMenuTest()
	{
		init();
	}

	public void init()
	{
		f=new Frame("my window");
		f.setBounds(300,100,650,600);
		

		bar=new MenuBar();
		ta=new TextArea();
		fileMenu=new Menu("文件");

		openItem=new MenuItem("打开");
		saveItem=new MenuItem("保存");	
		closeItem=new MenuItem("退出");
		
		//添加打开保存退出至菜单中
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(closeItem);
		
		
		bar.add(fileMenu);
		f.setMenuBar(bar);
		
		//调用打开和保存功能
		openDia=new FileDialog(f,"我要打开",FileDialog.LOAD);
		saveDia=new FileDialog(f,"我要保存",FileDialog.SAVE);
		
		f.add(ta);
		myEvent();
		f.setVisible(true);
	}

	public void myEvent()
	{
		//设置保存监听
		saveItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//若文件原先不存在，则先获取路径及名称新建此文件，此时会跳出保存框，否则不跳出直接保存。
				if(file==null)
				{
					saveDia.setVisible(true);
					String dirPath=saveDia.getDirectory();
					String fileName=saveDia.getFile();
					
					if(dirPath==null || fileName==null)
						return;
					file=new File(dirPath,fileName);
				}
				
				//文件存在后，开始保存TextArea中的内容
				try
				{
					BufferedWriter bufw=new BufferedWriter(new FileWriter(file));
					String text=ta.getText();

					bufw.write(text);
					bufw.close();
				}
				catch (IOException ex)
				{
					throw new RuntimeException();
				}
			}
		});


		//设置打开监听
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//获取打开路径和文件
				openDia.setVisible(true);
				String dirPath=openDia.getDirectory();
				String fileName=openDia.getFile();
				System.out.println(dirPath+"...."+fileName);
				if(dirPath==null || fileName==null)
					return;
				
				//每次打开都先初始化TextArea中的内容
				ta.setText("");
				file=new File(dirPath,fileName);
				
				//遍历file中的内容，写入至TextArea中
				try
				{
					BufferedReader bufr=new BufferedReader(new FileReader(file));

					String line=null;
					while ((line=bufr.readLine())!=null)
					{
						ta.append(line+"\r\n");
					}
					bufr.close();
				}
				catch (IOException ex)
				{
					throw new RuntimeException("读取失败");
				}
			}
		});


		//设置退出监听
		closeItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		//设置窗体关闭监听
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}


	public static void main(String[] args) 
	{
		new MyMenuTest();
	}
}
