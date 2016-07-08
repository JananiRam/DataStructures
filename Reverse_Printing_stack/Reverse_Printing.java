import java.util.ArrayList;
import java.util.List;
class Reverse_printing extends Stack
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		String expr="A*B-(C+D)+E";
		for(int i=0;i<expr.length();i++)	
			s.push(expr.charAt(i));
		Reverse_printing p=new Reverse_printing();
		System.out.println("===============Stack1=================");s.show();
		Stack s1=new Stack();
		for(int i=0;i<=expr.length();i++)
		{
			
			s1.push(s.pop());
		}System.out.println("===============Stack2=================");s1.show();
		
	}
	
}
class Stack
{	
	char arr[]=new char[20];
	int  top;
	Stack()
	{
		top=0;
	}
	public void push(char c)
	{
		arr[top]=c;
		top++;
		//System.out.println("inserted");
	}
	public char pop()
	{
		char c=arr[top];
		top--;	
		return c;
	}
	public void show()
	{
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
	}
}