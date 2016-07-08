import java.io.*;
import java.util.*;
class Deno
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={1,3,5};
		int n=sc.nextInt();int i,j,temp;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];	
					a[j]=temp;		
				}
			}
		}
		int coun=0,cun=0;
		for(i=0;i<3;)
		{
			
				if(n>=(coun+a[i]))
				{
					coun+=a[i];cun++;				
				}
				else
					i++;				
				if(coun==n)
				{
					System.out.println("Coins="+cun);
					break;
	
				}
		}

	}
}
