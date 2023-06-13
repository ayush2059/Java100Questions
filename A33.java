//How to multiply two matrix in java Program

package codingpract;

import java.util.Scanner;

class MatrixMul
{
	Scanner s=new Scanner(System.in);
	int r,c;
	int sum=0;
	public void show()
	{
		System.out.println("enter the no of row and matrix for matrix 1");
		r=s.nextInt();
		c=s.nextInt();
		int[][]arr=new int[r][c];
		int[][]brr=new int[r][c];
		int[][]crr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("enter the elemnt for matrix 1");
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("enter the elemnt for matrix 2");
				brr[i][j]=s.nextInt();
			}
		}	
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				for(int k=0;k<r;k++)
				{
					sum=sum+arr[i][k]*brr[k][j];
					crr[i][j]=sum;
					sum=0;
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(brr[i][j]+" ");
				
			}System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(crr[i][j]+" ");
				
			}System.out.println();
		}
	}
	
}
public class A33 {

	public static void main(String[] args) {
		MatrixMul mlx=new MatrixMul();
		mlx.show();
	}

}
