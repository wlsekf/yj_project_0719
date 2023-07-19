package j0719_1;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n=s1.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		s1.close();
	}

}
