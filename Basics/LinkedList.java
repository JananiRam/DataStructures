import java.io.*;
import java.util.Scanner;
class Node
{
	int data;
	Node next;
	public Node(int item)
	{
		data=item;
		next=null;
	}
	void append(int item)
	{
		Node temp=this;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node f=new Node(item);
		temp.next=f;
}
	public void insert(int item,int pos)
	{	
		Node temp=this;
		Node old=this;
		for(int i=0;i<=pos;i++)
		{	if(i!=pos)
			{
				old=temp;
				temp=temp.next;
			}
			else
			{
				System.out.println("old="+old.data+"temp="+temp.data);
				Node r=new Node(item);
				r.next=temp;
				old.next=r;
		
			}
		}
		
	}
	public int delatEnd()
	{
		Node old=this;Node f=this;
		while(f.next!=null)
		{
			old=f;
			f=f.next;
		}
		old.next=null;
		//free f;
		return f.data;
	}	
}	
class LinkedList
{
	Node root;
	static int count;
	LinkedList()
	{
		count=0;
		root=null;
	}
	public void show()
	{	System.out.println("=====================w===========\n");
		Node temp;
		temp=root;
		while(temp!=null)
		{	
			
			System.out.print(temp.data+"->");
			temp=temp.next;
		}	
		System.out.println("NULL");

	}
	public int delatbeg()
	{
		count--;
		Node te=root;
		root=root.next;
		return te.data;
	}
	public void atbeg(int item)
	{
		count--;
		Node temp=new Node(item);
		temp.next=root;
		root=temp;
	}
	public void readFromN(int n)
	{
		/*--------------------------------------------------------------Method 1------------------------------------------------------------------
			Node temp=root;
			for(int i=count;i>=1;i--)
			{
				if(i<=n)
				{
					System.out.println(temp.data+"");	
				}
				System.out.println("COunt="+count);
				temp=temp.next;
			}	
		---------------------------------------------------------------------------------------------------------------------------------------------------*/
		Node temp1,temp2;
		temp1=root;temp2=root;
		
	
	}
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		
		ll.root=new  Node(90);ll.show();count++;
		ll.root.append(900);ll.show();count++;

		ll.atbeg(67);ll.show();count++;
		ll.root.append(901);ll.show();count++;
		ll.root.append(902);ll.show();count++;
		ll.root.insert(56,0);ll.show();count++;
		int item=ll.delatbeg();		 
		System.out.println("Delete at beg"+item);
		ll.show();
		item=ll.root.delatEnd();
		System.out.println("Delete at end"+item);
		ll.show();		
		System.out.println("Count="+count);
		System.out.println("reading from nth node");
		
		ll.readFromN(1);
		
	}
}
