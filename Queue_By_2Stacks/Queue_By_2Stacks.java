import java.util.ArrayList;
import java.util.Scanner;
class Stack
{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	int top;
	Stack()
	{
		top=0;
	}
	boolean isEmpty()
	{
		if(top==0)
			return true;
		return false;
	}
	void push(int item)
	{
		arr.add(item);
		top++;	
	}
	int pop()
	{
		int item=arr.remove(0);
		top--;
		return item;
	}
}
class Queue_By_2Stacks
{
	public static void main(String args[])
	{
		Stack s1=new Stack();
		Stack s2=new Stack();
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1.Push\n2.pop\n3.exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					s1.push(sc.nextInt());
				break;
				case 2:
					if(s2.isEmpty())
					{
						while(!s1.isEmpty())
						{
							s2.push(s1.pop());
							
						}
						s1.top=0;
					}
					System.out.println(s2.pop()+"is popped\n\n");
				break;
				case 3:
				break;
			}
			System.out.println("Stack s1="+s1.arr+"\n\nStack s2="+s2.arr);
		}while(ch!=3);
		
	}
}