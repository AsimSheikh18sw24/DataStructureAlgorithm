/* 
Task number 1:-
				Write a java code a Array of length 100 fill it with random in values for testing purpose
18SW15
18SW24
18SW26
18SW30
*/

public class Task1{ 

public static void main(String args[]){  

	//creating an 100 element array

	int a[] = new int[100];

  	for(int i=0;i<a.length;i++){
  		a[i] = (i+1)*3;
  		// initializing the multiples of three(3)
  		System.out.println(a[i]);
  	} // end of for loop 

	} // end of main method
}
