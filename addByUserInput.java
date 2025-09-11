package pack1;
import java.util.Scanner;

public class addByUserInput {

	void meth1(){
		// TODO Auto-generated constructor stub)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd value");
		int y = sc.nextInt();
		int sum;
		sum = x+y;
		System.out.println("Sum of two number is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new addByUserInput().meth1();

	}

}
