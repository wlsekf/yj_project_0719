package j0719_1;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("출력할 단 입력 : ");
		int dan=s1.nextInt();
		
		int i=1;
		while(i<10) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			i++;
		}
		
		for(int j=1; j<10; j++) {
			System.out.printf("%d*%d=%d\n",dan,j,dan*j);
		}
		
		int j=1;
		while(j<10) {
			System.out.printf("%d*%d=%d\n",dan,j,dan*j);
			j++;
		}
		
		int sum=10000;
		System.out.printf("교통카드 잔액 : %d\n", sum);
		int amt=0;
		while(true) {
			System.out.print("교통카드 사용액 : ");
			amt=s1.nextInt();
			sum-=amt;
			System.out.printf("교통카드 잔액 : %d", sum);
			if(sum < 1300)
				System.out.println("교통카드 잔액이 부족하여 사용하실 수 없습니다.");
				break;
		}
	
		s1.close();
	}

}
