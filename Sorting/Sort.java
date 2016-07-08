import java.io.*;
import java.util.*;
class Node
{
	int data;
	Node next;
	public Node(int item)
	{
		data=item;
		next=null;
	}
	public void append(int item)
	{
		Node temp=this;Node r=new Node(item);
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=r;
	}
	
}
class Sort
{
	Node root;
	Sort()
	{
		root=null;
	}
	public static void main(String args[])
	{
		Sort so=new Sort();
		int ch,item;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.Append\n2.Enter to sort\n3.sort-in-pairs\n4.exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter item");
					item=sc.nextInt();
					if(so.root==null)
					{
						so.root=new Node(item);
					}
					else
						so.root.append(item);
				break;
				case 2:
					System.out.println("Enter a number to sort");
					so.sort(so.root,sc.nextInt());
				break;
				case 3:
					System.out.println("Enter a number to sort");
					so.sort1(so.root);
				break;
				
			}
			so.show();
		}while(ch!=4);
	}
	void sort(Node t,int item)
	{
		System.out.println("Inside sort");
		int  temp;Node t1;int j;
		for(int i=1;i<item  && t!=null;i++,t=t.next)
		{System.out.println("t="+t.data);
			for( j=i+1,t1=t.next;j<=item && t1!=null;j++,t1=t1.next)
			{
				System.out.println("t1.data="+t1.data);
				if(t.data<t1.data)
				{
					temp=t.data;
					t.data=t1.data;
					t1.data=temp;
					
					
				}
			}
		}
		if(t!=null)
			sort(t.next,item);
		
	}
	void sort1(Node temp)
	{int y;
		System.out.println("Sorting in pairs");
		if(temp.data>temp.next.data)
		{
				y=temp.data;
				temp.data=temp.next.data;
				temp.next.data=y;
		}
		
		if(temp.next.next!=null)
			sort1(temp.next.next);
	}
	void show()
	{
		System.out.println("==================Linked LIst========================");
		Node temp=root;
		while(temp!=null)
		{	System.out.print(temp.data+" - >");
			temp=temp.next;
		}
		System.out.print("NULL\n");
	}
}