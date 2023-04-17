package accessmodifier2;

public class a {
	
	public int n=45;
	
	public void m1() {
		System.out.println("m1 method");
		
	}
  public static void main(String[]arg) {
	   
	  a a1=new a();
	  System.out.println(a1.n);
	  a1.m1();
  }
}
