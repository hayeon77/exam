package exam;

public class star {

	public static void main(String[] args) {
		for (int line = 1; line <= 7; line++) {
			// line는 1,2,3,4,5,6,7까지 증가한다.
			for (int star = 7; star >= line; star--) {
				/*
				 * line이 1일 때 star는 7,6,5,4,3,2,1까지 성립되므로 첫째줄에는 별이 7개 찍힌다. star가 0이 될 때 조건이 성립되지
				 * 않으므로 바깥 순환문으로 빠지고 다시 처음부터 반복된다.
				 */
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}