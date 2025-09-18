package pack1;

public class ass1 {
	public int meth1(int x, int y)
	{
		int z;
		z = x+y;
		meth2('a', 20);
		return z;
	}
	public int meth2(char a, int b ) {
		
		System.out.println(+a);
		return meth3('a');
	}
	public int meth3(char a) {
		return 'a';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ass1 obj = new ass1();
		System.out.println(obj.meth1(10,20));
		
	}

}
