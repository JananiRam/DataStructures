import java.util.*;
class one_zero
{
	static int matrix[][];
	
	public static void main(String args[])
	{int r,c;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		matrix=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		check(r,c,0);
		//System.out.println();
	}
	public static void check(int i1,int j1,int check)
	{int i,j;
		for( i=0;i<i1;i++)
		{
			for( j=0;j<j1;j++)
			{
				if(matrix[i][j]==check)
				{
					continue;
				}
				else
					break;
			}
		}	
		
		check(j1,i1,1);//System.out.println(""+j);
	}
}