package pack1;

public class Hash1Code{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash1Code aobj = new Hash1Code();
		//Hash1Code bobj = new Hash1Code();
		System.out.println("aobj: "+aobj.hashCode());
		//System.out.println("bobj: "+bobj.hashCode());
		//System.out.println(aobj.equals(bobj));
		System.out.println(aobj.equals(new Hash1Code()));
		System.out.println(new Hash1Code().equals(new Hash1Code()));
	}

}
