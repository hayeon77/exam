//은행 계좌를 하나 가지고 있다
//은행 계좌를 통해 입금, 출금 처리를 할 수 있다

//친구 5명 똑같은 카드 복제
//동시에 계좌 출금

//통장 1000만원
//ATM 기기 동시에 출금...

//개발자
//막아야 산다
//어느 누군가 출금...Lock 통해서 처리
class Account {
	int balance = 1000; // 잔액

	void withDraw(int money) {
		System.out.println("고객:" + Thread.currentThread().getName());
		System.out.println("현재 잔액:" + this.balance);

		if (this.balance >= money) {
			try {
				Thread.sleep(1000); // 홍길동 인출..(인증, 카드 비번...)
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
			this.balance -= money;

		}
		System.out.println("인출금액:" + money);
		System.out.println("인출 후 잔액:" + this.balance);
	}
}

class Bank implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.balance > 0) {
			int money = ((int) (Math.random() * 3) + 1) * 100;

			acc.withDraw(money);
		}

	}

}

public class Ex11_Sync_Thread {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread th = new Thread(bank, "park");
		Thread th2 = new Thread(bank, "Kim");
		Thread th3 = new Thread(bank, "Lee");

		th.start();
		th2.start();
		th3.start();

	}

}
