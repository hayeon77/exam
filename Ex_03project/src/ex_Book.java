import kr.or.bit.Book;

public class ex_Book {

	public static void main(String[] args) {

		Book b1 = new Book(25000, "이것이자바다");
		b1.bookInfor();
		//b1.getBookPrice();
		//b1.getBookName();
		System.out.println("b1의가격:"+b1.getBookPrice());
		System.out.println("b1의이름:"+b1.getBookName());
		
		Book b2 = new Book(10000, "수학의정석");
		b2.bookInfor();
		System.out.println("b2의가격:"+b2.getBookPrice());
		System.out.println("b2의이름:"+b2.getBookName());

		Book b3 = new Book(15000, "파브르곤충기");
		b3.bookInfor();
		System.out.println("b3의가격:"+b3.getBookPrice());
		System.out.println("b3의이름:"+b3.getBookName());
	}
}
