import java.util.Scanner;
class Area{
	double length,width;
	// initialization 
	public void setDim(double length, double width){
		this.length = length;
		this.width = width;
	}
	// returns the Area
	public double getArea(){
		return length*width;
	}
	//
	
}
class MainTask2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double l,w;
	System.out.println("Insert the length of Rectangle");
	l = sc.nextDouble();
	System.out.println("Insert the width of Rectangle");
	w = sc.nextDouble();

	Area area = new Area();
	area.setDim(l,w);
	System.out.println("Area = " + area.getArea() );

	}
}