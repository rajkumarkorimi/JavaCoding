package pack1;

public class autoboxing {
	void auto() {
	int i = 10;
	Integer i1 = i;
	Integer i2 = new Integer(i);
	Integer i3 = Integer.valueOf(i);
	System.out.println(i);
	System.out.println(i3);
	System.out.println(i2);
	
	}
	static {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		autoboxing obj = new autoboxing();
		obj.auto();
		
	}

}
