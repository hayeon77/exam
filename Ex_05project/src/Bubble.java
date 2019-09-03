public class Bubble{

	public static void main(String[] args) {

		int[] array = { 51, 2, 8, 14, 6, 35 };
		int temp;

		System.out.println("******** 버블 정렬 전 ********");
		for (int a = 0; a < array.length; a++) {
			System.out.print(array[a] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("******** 버블 정렬 후 ********");
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}
}