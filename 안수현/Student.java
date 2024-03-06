package w1;

public class Student {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsNum() {
		return sNum;
	}

	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	private String sNum;
	
	Student(String name, String sNum) {
		this.name = name;
		this.sNum = sNum;
	}
}
