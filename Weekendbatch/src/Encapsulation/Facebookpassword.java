package Encapsulation;

public class Facebookpassword {
	private String Password="Ayesha@1259";

	public String get() {
		return Password;
	}
	public void set(String Password) {
		this.Password=Password;
		
	}
}
class samplemain{
	public static void main (String[]args) {
		Facebookpassword f1 = new Facebookpassword ();
	String x=f1.get();
	System.out.println(x);
	
	f1.set("Ayesha59");
	System.out.println(f1.get());
	}
}
