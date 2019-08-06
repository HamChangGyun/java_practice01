package practice01.prob1;
import java.util.Scanner;

public class Prob1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if(a%3 == 0)
			System.out.println("3의 배수입니다.");
		
		sc.close();
	}
}
