import java.io.*;
import java.util.*;
class Area
{
	static int matrix[][];
	static int r,c;
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter ordder of matrix");
		r=in.nextInt();
		c=in.nextInt();
		int[][] matrix=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=in.nextInt();
			}
		}
		int a[]=new int[c];
		for(int j=0;j<c;j++)
		{
			for(int i=0;i<r;i++)
			{
				a[j]+=matrix[i][j];
			}
		}
		int max=-100;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int curarea=a[i]+a[j];
				if(curarea>max)
					max=curarea;
			}
		}
		System.out.println("Maximum area="+max);
	}
	public static void show()
	{
		for(int i=0;i<r;i++)
		{
			System.out.println("");
			for(int j=0;j<c;j++)
			{
				System.out.print(matrix[i][j]);
			}
		}
	}
}