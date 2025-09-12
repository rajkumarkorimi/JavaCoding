package pack1;
import java.util.Arrays;
import java.util.Scanner;

public class AddUserInputArrays {

	void meth1() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		int arr[];
		int sum=0;
		
		System.out.println("Enter the length of the array");
		int x = sc.nextInt();
		arr = new int[x];
		System.out.println("enter the array values");
		
		for(int i=0; i<arr.length; i++) {
			int y = sc.nextInt();
			arr[i] = y;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of the arr is "+sum);
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddUserInputArrays().meth1();

	}

}
