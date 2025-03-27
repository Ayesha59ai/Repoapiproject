package com.family.myfamily;
class Canara
{
private int atm_pin=3012;
public int get_atmpin()
{
return atm_pin;
}
public void set_atmpin(int atm_pin)
{
	this.atm_pin=atm_pin;
}
}
public class Ayesha {
	public static void main(String[]args)
	{
		Canara_bank	c1=new Canara_bank();
		int x=c1.get_atmpin();
		System.out.println(x);
		c1.set_atmpin(1234);
		System.out.println(c1.get_atmpin());
	}
}
