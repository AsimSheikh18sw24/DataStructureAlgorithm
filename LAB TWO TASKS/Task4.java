/* 
Task number 4:-
				Write a method in java with float as its return type that takes array as input and return average as output
18SW15
18SW24
18SW26
18SW30
*/
public class Task4{
	public static void main(String[] args) {
		int[] a = {2,4,6,8,10,12};
		System.out.println("Average: " + average(a));
	} // end of main method

	public static float average(int arr[]){

		float sum = 0;

		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		} // end of for loop
		sum = sum/arr.length;
		return sum;
	} // end of average method which returns the average of the array

}
