
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class  MyWindowDemo
{
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	
	private Dialog d;
	private Label lab;
	private Button okBut;

	MyWindowDemo()
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
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					showDir();//�˺���ʵ��ת������
			}
		});

		
		//���ô��ڰ�ť����,����ʵ��ת������
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				showDir();
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
	private void showDir()
	{
		//��ȡ���ı����е�����
		String dirPath=tf.getText();
		//����ȡ���ĵ�ַ��Ϣװ���ļ���
		File dir=new File(dirPath);
				
		//����ַ���ڲ����ļ��С��������б���
		if(dir.exists() && dir.isDirectory())
		{
			ta.setText("");//�ȳ�ʼ���ı�������Ϣ
			String[] names=dir.list();
			for(String name:names)
			{
				ta.append(name+"\r\n");
			}
		}
		//����ַ����ȷ���������Ի���ʾ��
		else
		{
			String info="���������Ϣ��"+dirPath+"�Ǵ���ġ������䣡";
			lab.setText(info);
			d.setVisible(true);
		}
	}	


	public static void main(String[] args) 
	{
		new MyWindowDemo();
	}
}
