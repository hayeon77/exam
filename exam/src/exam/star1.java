package exam;

public class star1 {

	public static void main(String[] args) {
		for (int line = 1; line <= 7; line++) {
			// line�� 1,2,3,4,5,6,7���� �����Ѵ�.
			for (int star = 1; star <= line; star++) {
				/*
				 * line 1�� �� star�� 1������ �����ǹǷ� ù°�ٿ��� ���� 1�� ������. star�� 2�� �� �� ������ �������� �����Ƿ� �ٱ�
				 * ��ȯ������ ������ �ٽ� ó������ �ݺ��ȴ�.
				 */
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
