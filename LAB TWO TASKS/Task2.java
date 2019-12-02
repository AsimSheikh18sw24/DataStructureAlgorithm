/* 
Task number 2:-
				Write a java program to check if two arrays are equal
18SW15
18SW24
18SW26
18SW30
*/
public class Task2{
	public static void main(String[] args) {
		int a[] = {2,3,4,5,9,7,8,9};
		int b[] = {2,3,4,5,6,7,8,9};
	if(areArraysEqual(a,b)){System.out.println("Arrays are equal");	}
		else System.out.println("Arrays are not equal");
		
	}// end of main method

	public static boolean areArraysEqual(int a1[], int a2[]){
		int check = 0;
		if(a1.length == a2.length){
			for(int i=0;i<a1.length;i++){
				if(a1[i] != a2[i]){check+=1;
				}

			}// end of for loop
			if(check == 0) return true;
				else return false;
		}// end of if statement
			else return false;
	}/* end of areArrayEqual method which returns a boolean value 
		whether two arrays are equal or not
	*/

}
