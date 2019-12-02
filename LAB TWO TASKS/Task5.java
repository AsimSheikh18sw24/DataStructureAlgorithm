/*
Task5:
		Write a method in Java program to find the second largest element in an array. Method should
		take array as input and return index
18SW15
18SW24
18SW26
18SW30*/
import java.util.Scanner;
class Task5{
	int size=0;
	
	public void printSec(int size){
	
		this.size=size;
		
		int[] arr=new int[20];
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Elements : ");
		 for(int i=0;i<size;i++)
		 {
			 arr[i]=input.nextInt();
		 }
		 int count=0;
		 int max=arr[0];
		 int secmax=arr[0];
		 for (int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				secmax=max;
				max=arr[i];
				
		 
		}
		 else if (arr[i] > secmax) {
				secmax = arr[i];
				count=i;
				
 
			}
		
		}
		System.out.println("Index of seconf largest number : "+count+" and number is : "+secmax);
		
	}
	public static void main(String []args){

	SecondLargeEle obj= new SecondLargeEle();
	System.out.println("Enter the Size of Array :");
	Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		
		obj.printSec(size);
		
}
}