package exam;

public class star {

	public static void main(String[] args) {
		for (int line = 1; line <= 7; line++) {
			// line�� 1,2,3,4,5,6,7���� �����Ѵ�.
			for (int star = 7; star >= line; star--) {
				/*
				 * line�� 1�� �� star�� 7,6,5,4,3,2,1���� �����ǹǷ� ù°�ٿ��� ���� 7�� ������. star�� 0�� �� �� ������ ��������
				 * �����Ƿ� �ٱ� ��ȯ������ ������ �ٽ� ó������ �ݺ��ȴ�.
				 */
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}