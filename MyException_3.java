package day_5;

public class MyException_3 {
	String msg;
	public MyException_3(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "java.lang.Exception : " +msg;
	}
}
