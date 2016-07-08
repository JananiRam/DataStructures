import java.io.*;
import java.util.*;
class Node
{
	int data;
	Node next;
	public Node(int item)
	{
		next=null;
		data=item;
	}
	public void deldup()
	{
		Node temp=this;
		while(temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				System.out.println("Same\n so replaceing  temp.next.next.data="+temp.next.next.data);
				temp.next=temp.next.next;
			
			}
			else
				temp=temp.next;
		}

	}
	public void append(int item)
	{	
		Node temp=this;
		Node r=new Node(item);
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=r;
		temp=r;
		System.out.println("Appended");
	}
	
}
class DelDup
{
	Node head;
	DelDup()
	{
		head=null;
	}
	static void p(String g)
	{
		System.out.println(g);
	}
	static void pt(String g)
	{
		System.out.print(g);
	}
	public static void  print_rev(Node temp)
	{
		if(temp!=null)
		{
			print_rev(temp.next);	
			System.out.print(temp.data+"<-");
		}
		System.out.print("NULL");
	}
	public static void sort(Node temp)
	{
		Node t;
		int dummy;
		for(;temp!=null;temp=temp.next)
		{
			for(t=temp.next;t!=null;t=t.next)
			{
				if(temp.data>t.data)
				{
					dummy=temp.data;
					temp.data=t.data;
					t.data=dummy;
				}

			}	
		//	temp=temp.next;
		}
	}
	public static  void show(Node temp)
	{p("===================LINKED LIST=====================\n");
		while(temp!=null)
		{
			pt(temp.data+" - >");temp=temp.next;
		}System.out.print("NULL");
	}
	public static void main(String args[])
	{
		
		DelDup d=new DelDup();
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			p("1.Append\n2.sort\n3.delete duplicates\n4.exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					p("enter element\n");int data=sc.nextInt();
					if(d.head==null)
						d.head=new Node(data);
					else 
						d.head.append(data);
				break;
				case 2:
					sort(d.head);
				break;
				case 3:
					d.head.deldup();
				break;
				
			}
		show(d.head);
		p("==========================reverse linklist==================");
		print_rev(d.head);
		}while(ch!=4);
	}
}