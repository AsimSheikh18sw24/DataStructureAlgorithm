/*
Task 7:
		Write a Java program to remove the duplicate elements of a given array and return the new
		length of the array.
		Sample array: [20, 20, 30, 40, 50, 50, 50]
		After removing the duplicate elements the program should return 4 as the new length of the
array.
18SW15
18SW24
18SW26
18SW30
*/
class Task7{
	public static void main(String []args){
		int[] arr={2,10,10,20,20,30,40,50,50,50};
		int count=0,ans=0;
		int newlength=arr.length;
		System.out.println("lenght of original array : "+arr.length);
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				count++;
			
			}
			
		
		}
		
		
	}
	newlength=newlength-count;
		System.out.println("new size of array is "+newlength);
	}
}