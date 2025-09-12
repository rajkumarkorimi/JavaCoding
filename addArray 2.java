package pack1;

public class addArrays {

	void meth1() {
		// TODO Auto-generated constructor stub
		int sum = 0;
		int arr[] = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println("sum of the array "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addArrays obj=new addArrays();
		obj.meth1();
	}

}
