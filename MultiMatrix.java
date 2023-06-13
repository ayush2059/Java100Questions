package codingpract;
import java.util.Scanner;
class Fake
{
	int r1,r2,c1,c2;
	int sum=0;
	Scanner s=new Scanner(System.in);
	public void show()
	{
		System.out.println("enter the no of row and column for matrix 1");
		int r1=s.nextInt();
		int c1=s.nextInt();
		System.out.println("enter the no of row and column for matrix 2");
		int r2=s.nextInt();
		int c2=s.nextInt();
		if(c1!=r2)
		{
			System.out.println("matrix multiplication is not possible");
		}
		else
		{
			int[][]arr=new int[r1][c1];
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.println("enter the element for matrix 1");
					arr[i][j]=s.nextInt();
				}
			}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}System.out.println();
			}
			int[][]brr=new int[r2][c2];
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.println("enter the element for matrix 2");
					brr[i][j]=s.nextInt();
				}
			}
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
				System.out.print(brr[i][j]+"\t");
				}System.out.println();
			}
			System.out.println();
			int[][]crr=new int[r1][c2];
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					for(int k=0;k<r2;k++)
					{
						sum=sum+arr[i][k]*brr[k][j];
						
					}
					crr[i][j]=sum;
					   sum=0;
				}
			}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
				System.out.print(crr[i][j]+"\t");
				}System.out.println();
			}
			
		}
		
	}
}

public class MultiMatrix {

	public static void main(String[] args) {
		Fake ke=new Fake();
		ke.show();

}}
