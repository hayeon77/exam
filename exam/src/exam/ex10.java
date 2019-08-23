package exam;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) { // 조건 true 무한반복
			System.out.println(i);
			// 반드시 명시적인 증가감
			i--;
		}
//while (1~100)까지의 합
		int sum = 0;
		int j = 1;
		while (j <= 100) {
			// System.out.println(j);
			sum += j; // sum=sum+j;
			j++; // 명시적인 증가감
		}
		System.out.println("1부터 100까지의합:" + sum);

		// do ~while : 강제적 수행(실행)...무조건 한번은 실행하겠다
		// do (실행문) while(조건)

		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("숫자 입력해 (0~10)");
			inputdata = Integer.parseInt(sc.nextLine());
		} while (inputdata > 10);
		System.out.println("당신이 입력한 값은:" + inputdata);
	}
}
