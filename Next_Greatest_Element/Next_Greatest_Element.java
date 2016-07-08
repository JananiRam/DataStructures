import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class Stack
{
	int top;
	int arr[]=new int[20];
	Stack()
	{
		top=0;
	}
	int  pop()
	{
		int item=arr[top];
		top--;
		return item;
	}
	void push(int item)
	{
		arr[top]=item;
		top++;
	}
	int  getTop()
	{
		int top1=arr[(top-1)];
		return top1;
	}
	boolean isEmpty()
	{
		if(top==0)
			return true;
		return false;
	}
	void show()
	{
		System.out.println("=======================");
		for(int i=0;i<top;i++)
			System.out.print(arr[i]+"\t");	
		
	}
}
class Next_Greatest_Element
{
	public static void p(String g)
	{
		System.out.println(g);
	}
	public static void pt(String g)
	{
		System.out.print(g);
	}
	public static void main(String args[])
	{
		Stack t=new Stack();
		Stack stack=new Stack();
		Scanner sc=new Scanner(System.in);
		p("enter number of elements in Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		
		//Finding nextGreatest Integer
		int nextGreatestInteger;
		stack.push(a[0]);
		stack.show();
		for(int i=1;i<a.length;i++)
		{
			nextGreatestInteger=a[i];
			if(!stack.isEmpty())
			{
				int element=stack.pop();
				while(element<nextGreatestInteger)
				{p(a[i]+" - > "+nextGreatestInteger);
					if(stack.isEmpty())
						break;
					element=stack.pop();	
				}
				if(element>nextGreatestInteger)
					stack.push(element);
			}
			stack.push(nextGreatestInteger);	
			
		
		while(!stack.isEmpty())
		{
			int element=stack.pop();
			nextGreatestInteger=-1;
			p(a[i]+"->"+nextGreatestInteger);
		}
		stack.show();
		}
	}	
}