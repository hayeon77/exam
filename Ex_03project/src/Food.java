import kr.or.bit.Res;

public class Food {

	public static void main(String[] args) {
		Res res = new Res();
	      res.menuCode = 1111;
	      res.name = "짜장면";
	      res.part = "면";
	      res.info.calorie=100;
	      res.info.weight=5;
	      System.out.println(res.name);

	}

}
