package exam;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		/*
		 * System.out.println("�Է�"); Scanner sc = new Scanner(System.in); //ctrl + shift
		 * + o (inport���� �ڵ������ϱ�)
		 * 
		 * if(sc.hasNextInt()) { //�ǹ��� �Լ��� true, false System.out.println("�������̾�"); }
		 * else { System.out.println("�ٸ����ε�"); } //sc.hasNextLine() //�� ���ڿ� �����;� >>
		 * true, false
		 * 
		 * //��� (�ϱ�����) //���ǹ� (if�� 3����)-switch(){case .. break}) //�ݺ��� for(�ݺ�Ƚ�� ��Ȯ),
		 * while(true,false), do~while() //�б⹮ break(�� Ż��), continue(�Ʒ� ���� skip)
		 */

		int count = 0;
		if (count < 1) {
			System.out.println("True�Դϴ�");
		}

		// ����� ���� ����
		// �ڹ�; �����ݷ� ������ ��(�ؼ��� ����)
		if (count < 10)
			System.out.println("{True}");

		char data = 'A';
		switch (data) { // switch(���ڰ�) ����(����), char, string ����
		case 'A':
			System.out.println("���ں�");
			break; // Ż���� ����(*switch ��)
		default:
			System.out.println("else ��� ��");
		}
		// �ݺ���
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
			// ������
			sum += i;// sum = sum +1;
		}
		System.out.println("sum 1~10:" + sum);

		// for���� ����ؼ� 1~10������ Ȧ���� ���� ���غ�����
		// �� for�� �ϳ��� ������ �ذ��ϼ��� (for���� if�� ���� ������)

		int sum2 = 0;
		for (int i = 1; i <= 10; i += 2) {
			sum2 += i;
		}
		System.out.println("odd sum 1~10:" + sum2);

		// 1~100������ ��
		// ¦���� ���� ���Ͻÿ� (if�� ���)

		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum3 += i; // sum3= sum3+i
			}
		}
		System.out.println("1~100���� ¦���� ��:" + sum3);

		// �Ի����(�ʼ�)
		// ������ (��ø for�� ����ϱ�)
		// 2~9��
		// 2> 1~9 >>����
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					break; // ���� for�� Ż��
				}
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i * j);
			}
			System.out.println();
		}

		// key point: breakŻ��, continue��ŵ
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		for(int i=100; i>=0; i--) { //����
			System.out.println(i);
		}
		
	
			
	}
}
