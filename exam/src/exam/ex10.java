package exam;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 10) { // ���� true ���ѹݺ�
			System.out.println(i);
			// �ݵ�� ������� ������
			i--;
		}
//while (1~100)������ ��
		int sum = 0;
		int j = 1;
		while (j <= 100) {
			// System.out.println(j);
			sum += j; // sum=sum+j;
			j++; // ������� ������
		}
		System.out.println("1���� 100��������:" + sum);

		// do ~while : ������ ����(����)...������ �ѹ��� �����ϰڴ�
		// do (���๮) while(����)

		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("���� �Է��� (0~10)");
			inputdata = Integer.parseInt(sc.nextLine());
		} while (inputdata > 10);
		System.out.println("����� �Է��� ����:" + inputdata);
	}
}
