import kr.or.bit.Book;

public class ex_Book {

	public static void main(String[] args) {

		Book b1 = new Book(25000, "�̰����ڹٴ�");
		b1.bookInfor();
		//b1.getBookPrice();
		//b1.getBookName();
		System.out.println("b1�ǰ���:"+b1.getBookPrice());
		System.out.println("b1���̸�:"+b1.getBookName());
		
		Book b2 = new Book(10000, "����������");
		b2.bookInfor();
		System.out.println("b2�ǰ���:"+b2.getBookPrice());
		System.out.println("b2���̸�:"+b2.getBookName());

		Book b3 = new Book(15000, "�ĺ긣�����");
		b3.bookInfor();
		System.out.println("b3�ǰ���:"+b3.getBookPrice());
		System.out.println("b3���̸�:"+b3.getBookName());
	}
}
