/* 
Task number 6:-
				Write a java program to sort a matrix (Two dimensional array)
18SW15
18SW24
18SW26
18SW30
*/
import java.util.*;
import java.util.Arrays;
class Task6{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int rows=0,column=0;
		System.out.println("Enter the Number of Rows");
		rows=in.nextInt();
		System.out.println("Enter the Number of column");
		column=in.nextInt();
		int[][] arr2=new int[rows][column];
		for (int i=0;i<rows;i++)
		{
			for(int j =0;j<column;j++){
				arr2[i][j]=in.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matrix before sorting ");
		for (int i=0;i<rows;i++)
		{
			for(int j =0;j<column;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[] arrange= new int[rows*column];
		int count=0;
		
		for (int i=0;i<rows;i++)
		{
			for(int j =0;j<column;j++){
				arrange[count++]=arr2[i][j];
			}
			
		}
		Arrays.sort(arrange);
		
		for (int i=0;i<rows;i++)
		{
			for(int j =0;j<column;j++){
				arr2[i][j]=arrange[count++];
			} //  end of inner for
			
		}// end of outer for
		
		System.out.println("Matrix after sorting ");
		
		
		for (int i=0;i<rows;i++)
		{
			for(int j =0;j<column;j++){
				System.out.print(arr2[i][j]+" ");
			} // end of inner for loop
			System.out.println();
		} // end of outer for loop
		
		
	} // end of main method
}