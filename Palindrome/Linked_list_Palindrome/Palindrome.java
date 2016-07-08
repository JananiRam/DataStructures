import java.io.*;
class Node
{
	char data;
	Node next;
	public Node(char c)
	{
		data=c;next=null;
	}
}
class Palindrome
{
	Node root;
	Palindrome()
	{
		root=null;
	}
	Node append(Node temp,char c)
	{
		
		//Node temp=root;
		if(temp==null)
		{
			temp=new Node(c);
			return temp;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node r=new Node(c);
		temp.next=r;
		return root;
	}
	Node mid_Element()
	{
		Node temp,temp1;
		temp=root;
		temp1=root;
		while(temp.next!=null && temp.next.next!=null )
		{

			temp=temp.next.next;
			temp1=temp1.next;
		}
		
		return temp1;
	}
	public static void main(String args[])throws Exception
	{
		Palindrome palin=new Palindrome();
		String str="madam";
		for(int i=0;i<str.length();i++)	
		{
			palin.root=palin.append(palin.root,str.charAt(i));
			
		}	
		palin.show(palin.root);
		Node mid_element=palin.mid_Element();
		System.out.println("\nMiddle Elemnt="+mid_element.data);
		if(palin.isPalindrome(mid_element))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("NOt a Palindrome");
		palin.show(palin.root);
	}
	public Node reverse(Node mid_Node)
	{
		Node prev=null;Node current=mid_Node;
		Node next=null;
 	        while (current != null) {
        	    next = current.next;
        	    current.next = prev;
        	    prev = current;
        	    current = next;
        	}
		
		return prev;
	}
	public boolean  isPalindrome(Node mid)
	{
		Palindrome p=new Palindrome();
		Node temp=root;
		Node temp1=reverse(mid);
		while(temp!=mid && temp1!=null)
		{	
			if(temp.data==temp1.data)
			{
				temp=temp.next;
				temp1=temp1.next;
			}
			else
				return false;	
		}
		mid=reverse(mid);
		return  true;
	}
	public void show(Node temp)
	{
		System.out.println("=================");
		while(temp!=null)
		{
			System.out.print(temp.data+" - >");
			temp=temp.next;
		}
		System.out.print("NULL");
	}
}