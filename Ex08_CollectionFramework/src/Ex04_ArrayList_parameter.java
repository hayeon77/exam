import java.util.ArrayList;

class Empdata{
	private ArrayList elist;
	private int[] numbers;
	private String name;
	
	Empdata(){
		this.elist=new ArrayList();
		this.numbers=new int[10];
		this.name="아무개";
	}
	
	void setname(String name) {
		this.name=name;
	}
	String getName() {
		return this.name;
	}

	
	
	
	
	//elist getter : getElist()
	ArrayList getElist() {
		return this.elist;
	}
	//elist setter : setElist()
	void setElist(ArrayList elist) {
		this.elist = elist;
	}


	//private int[] numbers;
	//getter
	int[] getNumbers() {
		return this.numbers;
	}
	//setter
	void setNumbers() {
		this.numbers=numbers;
	}


	
}

public class Ex04_ArrayList_parameter {

	public static void main(String[] args) {
		Empdata edata = new Empdata();
		System.out.println(edata);
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		
		edata.setElist(li);
		
		System.out.println(edata.getElist().toString());
		

	}

}
