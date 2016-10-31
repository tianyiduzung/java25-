
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class  MyIEByGUI2
{
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	
	private Dialog d;
	private Label lab;
	private Button okBut;

	MyIEByGUI2()
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
		String urlPath=tf.getText();//http://192.168.1.126:8080/myWeb/Demo.html
		
		URL url=new URL(urlPath);
		
		URLConnection conn= url.openConnection();

		InputStream in=conn.getInputStream();

		byte[] buf=new byte[1024];

		int len=in.read(buf);

		ta.setText(new String(buf,0,len));
	}



	public static void main(String[] args) 
	{
		new MyIEByGUI2();
	}
}
