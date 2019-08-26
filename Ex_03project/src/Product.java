import java.util.Scanner;



public class Product {
	public static void main(String[] args) {


	}

	private int barcode=1010101;
	private int price=1000;
	private String name;
	private String kind;
	private String sales;
	private String nosales;
	
	
	public Product (int barcode, int price) {
		this.barcode=barcode;
		this.price=price;
	}


	public int getBarcode() {
		return barcode;
	}

	public String getName() {
		return name;
	}

	public String getKind() {
		return kind;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}
	
	
	public void Product() {
		System.out.println("바코드:"+barcode+"가격:"+price+"상품명"+name);
	}
}
/*
 * 
 * 
 * 
 * 바코드, 가격, 상품명의 정보는 확인 가능하다.
 */