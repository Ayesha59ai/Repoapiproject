package Prgpractice;

public class convertstrtoarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="javaprg";
		char []ch =str.toCharArray();
		for(int i=ch.length-1 ; i>=0; i--)
		{
			System.out.println(ch[i]);
		}
	}

}
