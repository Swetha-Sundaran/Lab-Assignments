package day_2;

//Program 7- To print the following output
//Hello I am a motorcycle, I am a cycle with an engine.
//My ancestor is a cycle who is a vehicle with pedals.
public class Bike_7 extends Cycle_7 {
	String define_me() {
		return "a cycle with an engine.";
	}

	Bike_7() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}
