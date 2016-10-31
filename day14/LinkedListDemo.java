import java.util.*;
/*
LinkedList:���з�����
addFirst();
addLast();

getFirst();
getLast();
��ȡԪ�أ�����ɾ��Ԫ�ء�

removeFirst();
removeLast();
��ȡԪ�أ�����Ԫ�ر�ɾ�������������û��Ԫ�أ������NoSuchElementException

��JDK1.6���������������

offerFirst();
offerLast();

peekFirst();
peekLast();
��ȡԪ�أ�����ɾ��Ԫ�ء����������û��Ԫ�أ��᷵��null��

pollFirst();
pollLast();
��ȡԪ�أ���Ԫ�ر�ɾ�������������û��Ԫ�أ��᷵��null��

*/

class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList link=new LinkedList();

		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");

		//sop(link);
		//sop(link.getFirst());
		//sop(link.getLast());
		//sop(link.removeFirst());
		//sop("size="+link.size());

		while(!link.isEmpty())
		{
			sop(link.removeFirst());
		}

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
