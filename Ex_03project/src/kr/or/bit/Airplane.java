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
		System.out.printf("��ȣ:%d, �̸�:%s\n", airnumber, airname);
	}
	public void printCount() {
		System.out.println("��:"+count);
	}
}
