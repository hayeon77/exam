/*


자산은 0보다 작아질 수 있습니다.



판매 된 옷을 다시 판매 할 경우 이미 판매된 옷이므로 메세지를 띄\
 */

package kr.or.bit;



public class Clothes {

	private String brand; // 옷의 브랜드
	private String kind; // 옷의 종류
	private int price; // 옷의 가격

	public static int capital = 1000000;// 초기 자산

	private static int fund; // 자산
	private static int totalsales; // 총 매출액
	private static int totalclothes; // 옷 갯수
	private static int totalcount; // 누적 판매량

	boolean isSale; // 판매 여부 스위칭 변수

	public Clothes(String brand, String kind, int price) { // 옷 만들 때
		// 한 벌 제작하는데 1만원씩 제작비로 사용됩니다.
		capital -= 10000;
		// 옷은 제작과 동시에 브랜드와 종류와 판매금액을 가지게 됩니다.
		this.brand = brand;
		this.kind = kind;
		this.price = price;
		totalclothes++; // 총 옷 갯수는 증가한다
	}

	/*
	 * 회사는 현재까지의 자산을 확인 할 수 있습니다.
	 * 
	 * 회사는 현재까지의 총 매출액을 볼 수 있습니다.
	 * 
	 * 회사는 보유중인 옷 갯수를 확인 할 수 있습니다.
	 * 
	 * 회사는 현재까지의 누적 판매량을 볼 수 있습니다.
	 */

	public static int getFund() {
		return fund;
	}

	public static int getTotalsales() {
		return totalsales;
	}

	public static int getTotalclothes() {
		return totalclothes;
	}

	public static int getTotalcount() {
		return totalcount;
	}

//특정 메소드를 통해 가격조정은 가능합니다.
	public void setPrice(int price) {
		this.price = price;
	}

	// 옷을 판매하면 매출액과 자산이 옷의 판매 금액만큼 더해지며 남은 옷의 갯수는 줄어듭니다.
	public void sale() {
		if (isSale == false) {
			totalcount++;
			totalsales += capital;
			fund += capital;
			totalclothes--;
		} else {
			System.out.println("이미 판매된 상품이야!");
		}
	}

	public void printInfo() { // 옷의 정보 출력
		System.out.println("브랜드:" + brand + "종류" + kind + "가격" + price);
	}

	//


}
