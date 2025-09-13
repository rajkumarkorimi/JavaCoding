package pack1;
import java.util.Arrays;

public class duplicatesArray {

	public duplicatesArray() {
		// TODO Auto-generated constructor stub
		int arr[] = {1,2,3,4,5,1,2};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new duplicatesArray();

	}

}
