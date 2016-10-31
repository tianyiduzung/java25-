
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
	//����򿪺ͱ���Ի���
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
		fileMenu=new Menu("�ļ�");

		openItem=new MenuItem("��");
		saveItem=new MenuItem("����");	
		closeItem=new MenuItem("�˳�");
		
		//��Ӵ򿪱����˳����˵���
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(closeItem);
		
		
		bar.add(fileMenu);
		f.setMenuBar(bar);
		
		//���ô򿪺ͱ��湦��
		openDia=new FileDialog(f,"��Ҫ��",FileDialog.LOAD);
		saveDia=new FileDialog(f,"��Ҫ����",FileDialog.SAVE);
		
		f.add(ta);
		myEvent();
		f.setVisible(true);
	}

	public void myEvent()
	{
		//���ñ������
		saveItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//���ļ�ԭ�Ȳ����ڣ����Ȼ�ȡ·���������½����ļ�����ʱ����������򣬷�������ֱ�ӱ��档
				if(file==null)
				{
					saveDia.setVisible(true);
					String dirPath=saveDia.getDirectory();
					String fileName=saveDia.getFile();
					
					if(dirPath==null || fileName==null)
						return;
					file=new File(dirPath,fileName);
				}
				
				//�ļ����ں󣬿�ʼ����TextArea�е�����
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


		//���ô򿪼���
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//��ȡ��·�����ļ�
				openDia.setVisible(true);
				String dirPath=openDia.getDirectory();
				String fileName=openDia.getFile();
				System.out.println(dirPath+"...."+fileName);
				if(dirPath==null || fileName==null)
					return;
				
				//ÿ�δ򿪶��ȳ�ʼ��TextArea�е�����
				ta.setText("");
				file=new File(dirPath,fileName);
				
				//����file�е����ݣ�д����TextArea��
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
					throw new RuntimeException("��ȡʧ��");
				}
			}
		});


		//�����˳�����
		closeItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		//���ô���رռ���
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
