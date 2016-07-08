import java.util.ArrayList;
import java.util.Scanner;
class Queue
{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	int front;
	int rear;
	Queue()
	{
		front=0;
		rear=0;
	}
	boolean  isEmpty()
	{
		if(front==rear)
			return true;
		return false;
	}
	void push(int item)
	{
		if(isEmpty())
		{front=0;rear=0;}		
		arr.add(item);rear++;
	}	
	int pop()
	{
		
		int item=arr.remove(front);// have to put arr[front] if it ia an array;
		rear--;// Have to put front ++ if it is an array
		return item;	
	}

}
class Stack_By_2Queues
{
	public static void main(String args[])
	{
		Queue q1,q2;
		q1=new Queue();
		q2=new Queue();int ch;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("1.Push\n2.Pop\n3.Exit");
		
		 ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				q1.push(sc.nextInt());
			break;
			case 2:
				if(q2.isEmpty())
				{
					while(!q1.isEmpty())
					{
						q2.push(q1.pop());
						
					}
				}
				System.out.println("POpped Elemnt="+q2.pop());
			break;
			case 3:
				System.out.println("Bye");
			break;
		}
		System.out.println("Queue 1 ="+q1.arr+"\nFront="+q1.front+"Rear="+q1.rear+"\nQueue 2="+q2.arr+"\nFront="+q2.front+"Rear="+q2.rear);
		}while(ch!=3);
	}	
}