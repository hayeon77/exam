package kr.or.bit;

public class Airplane {

	private int airnumber;
	private String airname;
	private static int count;

	public Airplane(int a, String b){
		airnumber=a;
		airname=b;
		count++;
	}
	public void airInfor() {
		System.out.printf("¹øÈ£:%d, ÀÌ¸§:%s\n", airnumber, airname);
	}
	public void printCount() {
		System.out.println("ÃÑ:"+count);
	}
}
