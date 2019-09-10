import java.util.HashMap;
import java.util.Scanner;

/*
  
 HashMap 활용한 로그인 시스템 구현 
  
 */
public class Ex12_HashMap {

	public static void main(String[] args) {
		// 회원가입 되었고 회원의 ID, pwd관리하고있다.(메모리로)
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("skott", "tiger");
		loginmap.put("lee", "kim1004");

		// 우리 시스템에 로그인하는 시나리오
		// ID(0), PWD(0) 회원 (환영)
		// ID(0), PWD(x) 실패 (비번다시 입력)

		// ID(X), PWD(0) >>실패 (다시 입력)

		// ID(X), PWD(X)
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ID, pwd 입력해주세요");
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();

			System.out.println("PWD");
			String pwd = sc.nextLine().trim();

			if (!loginmap.containsKey(id)) {
				System.out.println("ID 틀려요 재입력 하세요");
			} else {
				if (loginmap.get(id).equals(pwd)) {
					System.out.println("회원님 방가방가^^");
					break;
				}else {
					System.out.println("비번확인하세여");
				}
			}

		}

	}

}
