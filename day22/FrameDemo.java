
import java.awt.*;
import java.awt.event.*;

class FrameDemo 
{
	//�����ͼ�����������������á�
	private Frame f;
	private Button but;

	FrameDemo()
	{
		init();
	}

	public void init()
	{
		f=new Frame("my frame");

		//��frame���л������á�
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());

		but=new Button("my button");

		//��������ӵ�frame��
		f.add(but);

		//����һ�´����¼�
		myEvent();

		//��ʾ����
		f.setVisible(true);
	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//�ð�ť�߱��˳�����Ĺ���
		/*
		��ť�����¼�Դ��
		��ôѡ����һ���������أ�
		ͨ���رմ���ʾ���˽⵽����Ҫ֪���ĸ�����߱�ʲô�������еļ�������
		��Ҫ�鿴���������Ĺ��ܡ�
		ͨ������button�����������ְ�ť֧��һ�����м���addActionListener��
		*/
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("�˳�����ť�ɵ�");
				System.exit(0);
			}
		});
	}




	public static void main(String[] args) 
	{
		new FrameDemo();
	}
}