package day_4;

public class Circle extends Shape {
	float radius;
	public Circle(String name,float radius) {
		
		this.name = name;
		this.radius = radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getRadius() {
		return this.radius;
	}
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		float area;
		float radius = this.getRadius();
		area = (float) (3.14 * radius * radius);
		return area;
	}

}
