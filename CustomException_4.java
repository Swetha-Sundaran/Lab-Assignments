package day_5;

public class CustomException_4 {
	String msg;
	public CustomException_4(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "CustomException :"+msg;
	}

}
