package day_4;

public class Rectangle extends Shape {
	float length;
	float breath;
	public Rectangle(String name,float length,float breath) {
		
		this.name = name;
		this.length = length;
		this.breath = breath;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getLength() {
		return this.length;
	}
	public void setBreath(float breath) {
		this.breath = breath;
	}
	public float getBreath() {
		return this.breath;
	}
	@Override
	public float calculateArea() {
		
		float area;
		float length = this.getLength();
		float breath = this.getBreath();
		area = (float) (length * breath);
		return area;
	}

}
