/*
a = 1 -> 8->7-> NULL
b=  4->5->6->NULL
+
c= 5->3->3->NULL
*/
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
		Node temp=this,r=new Node(item);
		while(temp.next!=null)
			temp=temp.next;
		temp.next=r;
	}
}
class Sum
{
	Node root;
	Sum()
	{
		root=null;
	}
	void show(char d)
	{
		System.out.println("\n==================LinkedList "+d+" ===================\n");
		Node temp=root;
		while(temp!=null)
		{
			System.out.print(temp.data+" -  > ");
			temp=temp.next;
		}
		System.out.print("NULL\n");
	}
	Sum add(Node temp1,Node  temp2)
	{
		Sum j=new Sum();
		while(temp1!=null && temp2!=null)
		{
				if(j.root==null)
					j.root=new Node((temp1.data+temp2.data)%10);
				else
					j.root.append((temp1.data+temp2.data)%10);
				temp1=temp1.next;
				temp2=temp2.next;
		}
		return j;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Sum sum=new Sum();
		Sum a=new Sum();
		Sum b=new Sum();
		int ch,item;
		do
		{
			System.out.println("\n1.1st linked\n2.2nd linked\n3.sum\n4.Show\n5.exit");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println("Enter item to append");
						item=scan.nextInt();
						if(a.root==null)
							a.root=new Node(item);
						else
							a.root.append(item);
						
				break;
				case 2:
						System.out.println("Enter item to append");
						item=scan.nextInt();
						if(b.root==null)
							b.root=new Node(item);
						else
							b.root.append(item);
						
				break;
				case 3:
						sum=sum.add(a.root,b.root);
						
						a.show('a');
						b.show('b');
						sum.show('s');
				break;
					
				case 4:
						a.show('a');
						b.show('b');
						sum.show('s');
				break;
			}
		}while(ch!=5);
	}
}