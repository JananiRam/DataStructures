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

}
class Stack
{
	int top;
	ArrayList<Integer> arr=new ArrayList<Integer>();
	Stack()
	{
		top=0;
	}
	boolean isEmpty()
	{
		if(top<=0)
			return true;
		return false;	
	}
	void push(int item)
	{
		arr.add(item);top++;
	}	
	void pop()
	{
		int item=arr.remove(top-1);
		top--;
		//return item;
	}
	int getTop()
	{
		return arr.get(top-1);
	}
}
class Intersection_point_of_2LinkedList
{
	Node head;
	Intersection_point_of_2LinkedList()
	{
		head=null;
	}
	public Node append(int item)
	{
		if(head==null)
		{
			head=new Node(item);
			return head;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node r=new Node(item);
		temp.next=r;
		return temp;
	}
	public void show()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" - > ");
			temp=temp.next;
		}
		System.out.print("NULL");
	}	
	public static  int  method1(Node list1,Node list2)
	{
		if(list1==null || list2==null)
		{
			return -1;
		}
		
			while(list1.data!=list2.data)
			{	
				list1=list1.next;
				list2=list2.next;
			}
			return list1.data;
		
	}
	public static void main(String args[])
	{
		Intersection_point_of_2LinkedList list1=new Intersection_point_of_2LinkedList();
		Intersection_point_of_2LinkedList list2=new Intersection_point_of_2LinkedList();
		list1.append(2);
		list1.append(3);
		list1.append(4);
		list1.append(5);
		list1.append(10);
		list1.append(11);
		list1.append(12);
		list2.append(22);
		list2.append(23);
		list2.append(24);
		list2.append(25);
		list2.append(10);
		list2.append(11);
		list2.append(12);
		System.out.println("======================List1==============\n");
		list1.show();
		System.out.println("======================List2==============\n");
		list2.show();
		/*-------------------------------Method 1= compare 2 lists----------------------*/

		int mid_point=method1(list1.head,list2.head);
		System.out.println("Method1="+mid_point);
		/*-------------------------------Method 2= using stacks----------------------*/		
		mid_point=method2(list1.head,list2.head);
		System.out.println("\n\nMethod2="+mid_point);
		/*-------------------------------Method 2= using HashTable----------------------*/		
		System.out.println("\n\n Method 3="+list1.method3(list1.head,list2.head));

	}
	public    Node  delAtBeg(Node head)
	{
		int data=head.data;
		head=head.next;
		return head;
	}
	public static int method2(Node list1,Node list2)
	{
		Stack s1=new Stack();
		Stack s2=new Stack();
		for(;list1!=null;list1=list1.next)
			s1.push(list1.data);		
		for(;list2!=null;list2=list2.next)
			s2.push(list2.data);		
		int temp=-1;
		while(!s1.isEmpty()  || !s2.isEmpty())
		{
			
			if(s1.getTop()==s2.getTop())
			{
				temp=s1.getTop();
				s1.pop();s2.pop();continue;
			}
			return temp;
			
		}
		return -1;
	}	
	public int method3(Node list1,Node list2)
	{
		ArrayList<Integer> hash=new ArrayList<Integer>();
		while(list1!=null)
		{
			hash.add(list1.data);
			list1=delAtBeg(list1);
		//	System.out.println(list1.data);
			
		}
		System.out.println("Has === \t"+hash);
		
		while(list2!=null)
		{
		//	System.out.println("data="+d.data);
			if(hash.contains(list2.data))
				return list2.data;
			else
				hash.add(list2.data);
			list2=delAtBeg(list2);
		}
		return -1;
	}
}