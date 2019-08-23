import java.util.Scanner;

public class ex09_do_while_Menu {
	Scanner sc = new Scanner(System.in);

	void inputRecord() {
		System.out.println("���� ������ �Է�:");
	}

	void deleteRecord() {
		System.out.println("���� ������ ����:");
	}

	void sortRecord() {
		System.out.println("���� ������ ����");
	}

	int displayMenu() {
		System.out.println("*************");
		System.out.println("****��������****");
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2.�л����� �����ϱ�");
		System.out.println();
		System.out.println("3.�л����� �̸��� �����ϱ�");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();

		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4) {
					break; // while Ż��
				} else {
					throw new Exception("�޴����� ���� �߻�");
				}
			} catch (Exception e) {
				System.out.println("�޴� ���� ����");
				System.out.println("�޴� 1~4������ ����");
			}
		} while (true); // for(;;){}

		return menu; // 1~4���� ��ȣ�� �ϳ��� return
	}

	public static void main(String[] args) {
		ex09_do_while_Menu ex09 = new ex09_do_while_Menu();
		while (true) {
			switch (ex09.displayMenu()) {
			case 1:
				ex09.inputRecord();
				break;
			case 2:
				ex09.deleteRecord();
				break;
			case 3:
				ex09.sortRecord();
				break;
			case 4:
				System.out.println("���α׷� �����մϴ�");
				// return;
				System.exit(0); // ���α׷��� ���� ����
			}
		}

	}

}
