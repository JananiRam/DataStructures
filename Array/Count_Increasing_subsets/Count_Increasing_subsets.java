import java.io.*;
import java.util.*;
//--------------------------------------Better Solution------------------------------------------------------

class Count_Increasing_subsets
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter array number");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		int coun=0;	
		for(i=1;i<n;i++)
		{	
			
			for(j=i+1;j<=n;j++)
			{
				
				if(a[j-1]<a[j])
				{	coun++;}
				else
					break;
			}
		}
		System.out.println("count="+coun);
	}
}
//------------------------------------------------------------------------------------------------------------- 


//-------------------------------------------EFFICIENT SOLUTION------------------------------------------------
/*
coun=0;
len=1;
	for(i=1;i<=n-1;i++)
	{
		if(a[i]<a[i+1])
		{
			len++;
		}
		else
			coun+=((len-1)*len)/2;
	}
	if(len>1)
			coun+=((len-1)*len)/2;	
*/
//------------------------------------------------------------------------------------------------------------- 