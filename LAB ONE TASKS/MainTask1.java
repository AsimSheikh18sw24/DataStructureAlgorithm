import java.util.Scanner;
class Employee{
	private double sal;
	private float hours;
	// initializing the values
	public void getInfo(double sal, float hours){
		this.sal = sal;
		this.hours = hours;
	}
	// adding 10 if salary is less than $500
	public void addSal(){
		if(sal<500){
			sal = sal+10;
		}

	}
	// adding $5 if hours are greater than 6
	public void  addWork(){
		if(hours>6){
			sal+=5;
		}
	}
	// print the salary
	public void print(){
		System.out.println("Salary = $" + sal);
	}
}
public class MainTask1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		double s;float h;
		System.out.println("Enter the Salary");
		s = sc.nextDouble();
		System.out.println("Enter the Hours");
		h = sc.nextFloat();
		emp.getInfo(s,h);
		emp.addSal();
		emp.addWork();
		emp.print();

	}
}