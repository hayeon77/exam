import java.util.Scanner;

public class examproject {

	public static void main(String[] args) {
		int unit = 10000;
		int num = 0;
		int sw = 0;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		money = Integer.parseInt(sc.nextLine());
		
		while (true) {

			num = money / unit;

			System.out.println("unit:" + unit + "num:" + num);

			if (unit > 1) {
				money = money - unit * num;
				if (sw == 0) {
					unit = unit / 2;
					sw = 1;
				} else {
					unit = unit / 5;
					sw = 0;
				}

			} else {
				System.exit(0); // 프로그램을 강제 종료
			}

		}

	}

}
