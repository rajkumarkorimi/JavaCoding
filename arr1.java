package pack1;
import java.util.Arrays;
import java.util.Scanner;

public class arr1 {

	void arr2() {
		// TODO Auto-generated constructor stub
		Scanner sc= new Scanner(System.in);
		int arr[];
		arr = new int[5];
		System.out.println(arr.length);
		System.out.println("Enter the array values");
		for(int i=0; i<=arr.length-1; i++) {
			
			int x= sc.nextInt();
			arr[i]=x;	
		}
		//for(int i=0; i<=arr.length-1; i++)
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr1 obj=new arr1();
		obj.arr2();
		

	}

}
