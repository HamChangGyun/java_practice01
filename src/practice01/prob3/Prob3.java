package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			int a = sc.nextInt();
			if(a <= 0)
				break;
			if(a % 2 == 0) {
				for(int i = 0; i <= a; i++) {
					if(i % 2 == 0)
					{
						sum+=i;
					}
				}
			}
			else
			{
				for(int i = 0; i <= a; i++) {
					if(i % 2 != 0)
					{
						sum+=i;
					}
				}
			}
			System.out.println("결과 값 : " + sum);
			sum=0;
		}
		sc.close();
	}
}
