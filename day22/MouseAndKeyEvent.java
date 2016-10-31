
import java.awt.*;
import java.awt.event.*;

class  MouseAndKeyEvent
{
	private Frame f;
	private Button but;
	private TextField tf;

	MouseAndKeyEvent()
	{
		init();
	}

	public void init()
	{
		f=new Frame("my frame");

		//对frame进行基本设置。
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());

		tf=new TextField(20);

		but=new Button("my button");
	
		f.add(tf);
		f.add(but);
	
		myEvent();

		f.setVisible(true);
	}
	private void myEvent()
	{
		//添加窗口监听
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		//给文本区域添加键盘监听
		tf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				int code=e.getKeyCode();
				if(!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9))
				{
					System.out.println(code+"...是非法的");

					//让本次操作失效：不让文本框显示键盘此次输入的内容，并且程序不会结束
					e.consume();
				}
					
			}
		});

		//给Buf添加键盘监听
		but.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER)
					System.exit(0);
				//System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"...."+e.getKeyCode());
			}
		});

		//添加按钮激活监听
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("action ok");
			}
		});
		
		/*
		//添加鼠标监听
		but.addMouseListener(new MouseAdapter()
		{
			private int count=1;
			private int clickCount=1;
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("鼠标进入到该组件"+count++);
			}
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
					System.out.println("双击动作"+clickCount++);
			}
		});
		*/

	}




	public static void main(String[] args) 
	{
		new MouseAndKeyEvent();
	}
}
