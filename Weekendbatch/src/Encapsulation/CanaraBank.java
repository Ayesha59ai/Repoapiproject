package Encapsulation;

public class CanaraBank {
	private int atmpin=3012;
	
	public int get() {
		
		return atmpin;
	}
}
class Demo{
	public static void main (String[]args) {
		CanaraBank c1=new CanaraBank();
		int x=c1.get();
		System.out.println(x);
	}
}