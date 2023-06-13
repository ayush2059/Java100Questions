//How to add two matrix in java Program

package codingpract;

import java.util.Scanner;

class MatrixAddd
{
	Scanner s=new Scanner(System.in);
	int r,c;
	public void main()
	{
		System.out.println("enter no of row and column");
		r=s.nextInt();
		c=s.nextInt();
		int[][]arr=new int[r][c];
		int [][]brr=new int[r][c];
		int[][]crr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			    System.out.println("enter the elemnt for First matrix "+ "Row:- "+i+" "+"Column:-"+ j);
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("enter the elemnt for Second  matrix "+ "Row:- "+i+" "+"Column:-"+ j);
				brr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			 System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			    System.out.print(brr[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			    System.out.print(crr[i][j]+" ");
			}System.out.println();
		}
	}
}


public class A32 {

	public static void main(String[] args) {
		
		
		MatrixAddd add=new MatrixAddd();
		add.main();
		

	}}
