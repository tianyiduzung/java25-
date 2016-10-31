
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class  MyIEByGUI
{
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	
	private Dialog d;
	private Label lab;
	private Button okBut;

	MyIEByGUI()
	{
		init();
	}

	public void init()
	{
		//设置Frame窗口
		f=new Frame("my window");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());

		tf=new TextField(60);

		but=new Button("转到");

		ta=new TextArea(25,70);
	
		f.add(tf);
		f.add(but);
		f.add(ta);
		f.setVisible(true);
		
		
		//设置跳出的对话框Dialog
		d=new Dialog(f,"提示信息-self",true);//为true，则不操作Dialog无法操作原Frame
		d.setBounds(400,200,240,150);
		d.setLayout(new FlowLayout());
		lab=new Label();
		okBut=new Button("确定");

		d.add(lab);
		d.add(okBut);


		//调用监听机制
		myEvent();
	}

	private void myEvent()
	{
		//设置确定监听按钮
		okBut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//按钮功能为点击后对话框不可见
				d.setVisible(false);
			}
		});

		//设置对话框关闭监听
		d.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				d.setVisible(false);
			}
		});
		
		//设置文本框监听，当按下ENTER键时即可实现转到功能
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				try
				{
					if(e.getKeyCode()==KeyEvent.VK_ENTER)
					showDir();//此函数实现转到功能
				}
				catch (Exception ex)
				{
				}
				
			}
		});

		
		//设置窗口按钮监听,按下实现转到功能
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					showDir();
				}
				catch (Exception ex)
				{
				}
				
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

	//将转到功能打包成函数，以便调用
	private void showDir() throws Exception
	{
		ta.setText("");	
		String url=tf.getText();//http://192.168.1.126:8080/myWeb/Demo.html
		
		int index1=url.indexOf("//")+2;

		int index2=url.indexOf("/",index1);

		String str=url.substring(index1,index2);
		String[] arr=str.split(":");
		String host=arr[0];
		int port=Integer.parseInt(arr[1]);

		String path=url.substring(index2);
		//ta.setText(str+"..."+path);
				
		

		Socket s=new Socket(host,port);

		PrintWriter out=new PrintWriter(s.getOutputStream(),true);

		out.println("GET "+path+" HTTP/1.1");
		out.println("Accept: */*");
		out.println("Accept-Language: zh-CN");
		out.println("Host: 192.168.1.126:11000");
		out.println("Connection: closed");

		out.println();
		out.println();

		BufferedReader bufr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;

		while ((line=bufr.readLine())!=null)
		{
			ta.append(line+"\r\n");
		}
		s.close();
	}	


	public static void main(String[] args) 
	{
		new MyIEByGUI();
	}
}
