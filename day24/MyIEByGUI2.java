
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
		//����Frame����
		f=new Frame("my window");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());

		tf=new TextField(60);

		but=new Button("ת��");

		ta=new TextArea(25,70);
	
		f.add(tf);
		f.add(but);
		f.add(ta);
		f.setVisible(true);
		
		
		//���������ĶԻ���Dialog
		d=new Dialog(f,"��ʾ��Ϣ-self",true);//Ϊtrue���򲻲���Dialog�޷�����ԭFrame
		d.setBounds(400,200,240,150);
		d.setLayout(new FlowLayout());
		lab=new Label();
		okBut=new Button("ȷ��");

		d.add(lab);
		d.add(okBut);


		//���ü�������
		myEvent();
	}

	private void myEvent()
	{
		//����ȷ��������ť
		okBut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//��ť����Ϊ�����Ի��򲻿ɼ�
				d.setVisible(false);
			}
		});

		//���öԻ���رռ���
		d.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				d.setVisible(false);
			}
		});
		
		//�����ı��������������ENTER��ʱ����ʵ��ת������
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				try
				{
					if(e.getKeyCode()==KeyEvent.VK_ENTER)
					showDir();//�˺���ʵ��ת������
				}
				catch (Exception ex)
				{
				}
				
			}
		});

		
		//���ô��ڰ�ť����,����ʵ��ת������
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

		//���ô���رռ���
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

	//��ת�����ܴ���ɺ������Ա����
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
