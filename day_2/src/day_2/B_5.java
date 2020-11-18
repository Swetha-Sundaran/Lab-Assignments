package day_2;

//Program 5 Inheritance
public class B_5 extends A_5 {
	public void display() {
		System.out.println("My name is " + name);
	}

	public static void main(String[] args) {
		B_5 obj = new B_5();
		obj.name = "Swetha";
		obj.display();
		obj.work();

	}

}
