package day_4;

abstract class Shape {
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public abstract float calculateArea();
}



