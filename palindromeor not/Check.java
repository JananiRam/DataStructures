import java.io.*;
import java.util.Scanner;
class Node
{
	String data;
	Node next;
	public Node(String item)
	{
		data=item;
		next=null;
	}
	public void append(String item)
	{
		Node temp=this;
		Node newNOde=new Node(item);
		while(temp.next!=null)
			temp=temp.next;
		temp.next=newNOde;	

	
	}
}
class Check
{
	Node head;
	Check()
	{
		head=null;
	}
	public static void show(Node head)
	{
		if(head!=null)
		{
			System.out.print(head.data+" - >");
			show(head.next);		
		}
		else
		{
			System.out.print("NULL");
			return;
		}
			
	}
	public  static void check(Node head)
	{
		StringBuffer val=new StringBuffer();
		while(head!=null)
		{
			val.append(head.data);
			head=head.next;
		}
		
		StringBuffer g=new StringBuffer(val);g.reverse();
		System.out.println("Val="+val+"\ng="+g);
		if(val.matches(new String(g)))
			System.out.println("Its a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
	public static void main(String args[])
	{
		Check d=new Check();
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1.append\n2.check\n3.exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(d.head==null)
						d.head=new Node(sc.next());
					else
						d.head.append(sc.next());
				break;
				case 2:
					check(d.head);
				break;
			}
			show(d.head);
		}while(ch!=3);
	}
}