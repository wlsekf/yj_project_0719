package j0719_1;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int mon;
		do {
			System.out.println("올바른 월을 입력하시오 [1-12]: ");
			mon=s1.nextInt();
		} while(mon<1 || mon>12);
		System.out.println("사용자가 입력한 월은 "+mon);
		
		s1.close();
	}

}
