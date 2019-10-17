import java.util.Scanner;
class Area2{
	double length,width;
	// initialization 
	Area2(double length, double width){
		this.length = length;
		this.width = width;

		System.out.print("Area = " + returnArea());
	}
	// returns the Area
	public double returnArea(){
		return length*width;
	}
	
	
}
class MainTask3{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double l,w;
	System.out.println("Insert the length of Rectangle");
	l = sc.nextDouble();
	System.out.println("Insert the width of Rectangle");
	w = sc.nextDouble();

	new Area2(l,w);
	}
}