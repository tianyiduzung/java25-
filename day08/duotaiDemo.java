/*
多态：可以理解为事物存在的多种形态

1.多态的基本体现
	父类的引用指向了自己的子类对象。
	父类的引用也可以接收自己的子类对象。
2.多态的前题
	必须是与类之间有关系。要么继承，要么实现。
	通常还有一个前题：存在覆盖。
3.多态的好处
	多态的出现大大的提高了程序的扩展性。
4.多态的弊端：
	提高了扩展性，但是只能使用父类的引用访问父类中的成员。
5.多态的应用


*/

class Animal
{
	abstract void eat();
}

class cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}
	public void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void kanjia()
	{
		System.out.println("看家");
	}
}

class DuotaiDemo
{
	public static void main(String[] args)
	{
		Cat c =new Cat();
		c.eat();
	}
}