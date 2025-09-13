//5.COUNT FREQUENCY OF EACH ELEMENT IN AN ARRAY

package pack1;

public class Frequency {

	public Frequency() {
		int arr[] = {11, 11, 22, 22, 33, 11, 44};
		boolean counted[] = new boolean[arr.length];  

		for (int i = 0; i < arr.length; i++) {
			if (counted[i]) {
				System.out.println("hello "+i);
				continue; 
			}

			int t = arr[i];
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (t == arr[j]) {
					count++;
					counted[j] = true; 
				}
			}

			System.out.println("The frequency of " + t + " is " + count);
		}
	}

	public static void main(String[] args) {
		new Frequency();
	}
}

