import java.util.Arrays;

/*
 1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
      (int)(Math.random()*45 + 1)
      lotto[0] = 44, lotto[1] = 1....lotto[5] = 33
 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안돼요 (중복값 검증 : 별찍기 비슷)
 3. 배열에 있는 6개의 값은 낮은 순으로 정렬시키세요 (정렬 : 자리바꿈)
 4. 위 결과를 담고 있는 배열을 출력하세요 (화면에 출력시키기)
 
 추후에는 별도의 클래스 분리해서 Lotto.java.....현재 main.......연습
 */

public class Ex03_Lotto_Main {

	public static void main(String[] args) {

		int[] arr1 = new int[6]; 
		int[] arr2 = new int[6];
		int[] arr3 = new int[6];
		int[] arr4 = new int[6];
		int[] arr5 = new int[6];
		int[] arr6 = new int[6];
		int[] arr7 = new int[6];
		int[] arr8 = new int[3];

		{
			for (int line = 1; line <= 45; line++) {
				System.out.print(line + "\t");

			}
			System.out.printf("");
		}

	}

}
