/*
Task:3
		Use all of the array method discussed above in your java code but array should not be of type integer.
18SW15
18SW24
18SW26
18SW30
*/
import java.util.*;
class Task3{
public static void  printArray(char args[]){
	for(int i=0;i<args.length;i++){
		System.out.println(args[i]);
	}
}
public static void main(String arg[]){
 char []arr={'a','b','c','d','e'};
char [] unsort={'a','e','c','d','b'};
char []arr2={'a','b','c','d','e'};
char[] dest=new char[10];
//sort array
Arrays.sort(arr);
//print length
System.out.print("Length of an array:");
System.out.println(arr.length);
System.out.println("Binary Search of Character c:");
//apply binary search and print result
System.out.println(Arrays.binarySearch(arr,'c'));
//create copy of array
char []arrCopy=Arrays.copyOf(arr,10);
System.out.println("copy of array printed:");
printArray(arrCopy);
//create copy of range
System.out.println("copy Into range:");
char []copyIntoRange=Arrays.copyOfRange(arr,0,10);
printArray(copyIntoRange);
//equals method
System.out.println("Equals methods in array:");
System.out.println(Arrays.equals(arr,arr2));
//fill method
Arrays.fill(arr2,'a');
//printing filled array
System.out.println("Filled array with a:");
printArray(arr2);
//filling in specific range
Arrays.fill(arr2,2,4,'b');
//print array
System.out.println("Filling in specific range:");
printArray(arr2);
//sorting in specific range
Arrays.sort(unsort,2,5);
//print sorted in range array
System.out.println("printing sorted array:");
printArray(unsort);
//print array converted to string
System.out.println(Arrays.toString(unsort));
}
}