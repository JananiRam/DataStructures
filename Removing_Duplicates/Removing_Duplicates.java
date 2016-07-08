import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Stack
{
	int top;
	char a[]=new char[20];
	Stack()
	{
		top=0;
	}
	boolean isEmpty()
	{
		if(top<=0)
		{
			return true;
		}
		return false;
	}
	void push(char c)
	{
		
		a[top]=c;
		top++;
	}
	void pop()
	{
		top--;
		//return chr;
	}
	char top()
	{
		//char x=;
		return a[(top-1)];
	}
	void show()
	{
		System.out.println("====================Stack Elements=================\n");
		for(int i=0;i<top;i++)
		{
			System.out.println(a[i]);
		}
	}

}
class Removing_Duplicates//Sort_using_push&pop
{
	public static void p(String a)
	{
		System.out.println(a);
	}
	public static void pln(String a)
	{
		System.out.print(a);
	}
	public static void main(String args[])
	{
		Stack stack=new Stack();
		//Stack temp=new Stack();
		Scanner sc=new Scanner(System.in);
		p("ENter a Word");char c;
		String str=sc.next();
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			c=str.charAt(i);
			
			if(stack.isEmpty())
			{
				p("stack is empty");
				stack.push(c);
				continue;
			}	
			
			//p("Character==="+c+"\t Stack_Top="+stack.pop());
			if(stack.top()!=c)
			{	
				stack.push(c);
			}
			else	
				stack.pop();
			//stack.show();		
		}
		stack.show();				
	}

}