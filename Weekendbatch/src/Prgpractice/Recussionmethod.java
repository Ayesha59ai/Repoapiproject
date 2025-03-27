package Prgpractice;

public class Recussionmethod {
	static void disp(int no) {
		if(no<=10) {
			System.out.println(no);
			no++;
			disp(no);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
disp(1);
	}

}
