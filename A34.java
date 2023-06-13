//How to get transpose of matrix in java Program
package codingpract;

import java.util.Scanner;

class Transpose
{
	Scanner s=new Scanner(System.in);
	public void main()
	{
		System.out.println("enter no of row and column for matix");
		int r=s.nextInt();
		int c=s.nextInt();
		int[][]arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
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
				System.out.print(arr[j][i]+" ");
			}System.out.println();
		}
	}
}
public class A34 {

	public static void main(String[] args) {
		
		Transpose se=new Transpose();
		se.main();
	}

}
