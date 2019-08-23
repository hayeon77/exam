package kr.or.bit;

public class Book {
	private int BookPrice;
	private String BookName;


	public int getBookPrice() {
		return BookPrice;
	}

	public String getBookName() {
		return BookName;
	}

	public Book(int a, String b){
		BookPrice=a;
		BookName=b;	
	}
	
	public void bookInfor() {
		System.out.printf("가격:%d, 이름:%s\n", BookPrice, BookName);
	}

}














