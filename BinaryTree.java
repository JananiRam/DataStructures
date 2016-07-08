import java.io.*;
import java.util.*;
class Node
{
	int data;
	Node left,right;
	public Node(int item)
	{
		data=item;
		right=null;left=null;
	}
	
}
class BinaryTree
{
	Node root;
	BinaryTree()
	{
		root=null;
	}
	public static void p(String p1)
	{
		System.out.println(p1);
	}
	public static void plt(String p1)
	{
		System.out.print(p1);
	}
	void insert(int item)
	{
		root=insertRec(root,item);		
	}
	Node insertRec(Node root,int item)
	{
		if(root==null)
		{
			root=new Node(item);
			return root;
		}
		if(root.data<item)
		{	root.left=insertRec(root.left,item);}
		else
			root.right=insertRec(root.right,item);
		return root;
	}
	void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);		
		}
	}
	void preOrderfull(Node root)
	{
		Stack s=new Stack();
		while(true)
		{
			
			while(root!=null)
			{
				System.out.println(root.data);
				
				s.push(root);
				root=root.left;
							
			}
			if(!s.isEmptyStack())
				break;
			root=s.pop();
			root=root.right;
		}
			
	}
	public void inOrder(Node root)
	{
		Stack s=new Stack();
		while(true)
		{
			while(root!=null)
			{
				s.push(root);
				root=root.left;
			}
			if(!s.isEmptyStack())
				break;
			root=s.pop();
			System.out.println(root.data);
			root=root.right;
		}
	}
	public void postOrder(Node root)
	{
		Stack s=new Stack();	
		while(true)
		{
			while(root!=null)
			{
				s.push(root);
				root=root.left;
			}
			if(!s.isEmptyStack())
				break;
			root=s.pop();
			System.out.println(root.data);
			root=root.right;
			
		}
	}
	public void search(Node root,int item)
	{
		Stack s=new Stack();
		while(true)
		{
			
			while(root!=null)
			{	
				s.push(root);
				root=root.left;
			}
			if(!s.isEmptyStack())
			{
				System.out.println("Not Found");
				break;
			}
			root=s.pop();
			if(root.data==item)
			{
				System.out.println("found");
				return;
			}
			root=root.right;
		}
	}
	
	public static void main(String args[])
	{
		Stack s1=new Stack();
		Scanner scc=new Scanner(System.in);
		BinaryTree bt=new BinaryTree();p("enter a number");
		int n=scc.nextInt();
		for(int i=0;i<n;i++)
			bt.insert(scc.nextInt());
		p("1.preOrder\n2.postOrder\n3.INOrder\n4.Find");	
		int ch=scc.nextInt();bt.inOrder(bt.root);
		
		switch(ch)
		{
			case 1:
				p("preOrder");	
				bt.preOrder(bt.root);
				p("Without Recursion");
				bt.preOrderfull(bt.root);
		
			break;
			case 2:	
				p("Inorder Traversal");
				bt.inOrder(bt.root);
			break;
			case 3:
				p("Postorder Traversal");
				bt.postOrder(bt.root);
			break;
			case 4:
				do{
					p("Enter  a element to search");
		 			y=scc.nextInt();
					bt.search(bt.root,y);
				}while(y!=0);
		
			break;
			default:
				p("Sorry!!!!!!!!!!!!!!!!!!!!!");
		}
		int y;
		
		//p(""+bt.root.data);
	}
}
class Stack
{
	int top;
	Node a[]=new Node[30];
	Stack()
	{
		top=0;
	}
	public void push(Node item)
	{
		top++;
		a[top]=item;
		
	}
	public boolean isEmptyStack()
	{
		if(top<=0)
		{	return false;}
		else
		{	return true;}
	}
	public Node pop()
	{
		
		Node item;
		item=a[top];
		top--;
		
		return item;
	}
}