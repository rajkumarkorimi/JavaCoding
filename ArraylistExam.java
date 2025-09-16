package pack1;
import java.util.*;

public class ArraylistExam {
	
	public void meth() {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter "+i+" the element hi");
			list.add(sc.nextLine());
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		ArraylistExam obj = new ArraylistExam();
		obj.meth();
	}

}
