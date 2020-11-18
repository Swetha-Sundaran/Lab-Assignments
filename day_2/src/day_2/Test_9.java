package day_2;

//Program 9- To find the output of the given code
public class Test_9 {

	public static void main(String[] args) {
		Parent_9 p = new Parent_9();
		Child1_9 c1 = new Child1_9();
		Child2_9 c2 = new Child2_9();
		System.out.println(c1 instanceof Parent_9); // true
		System.out.println(c2 instanceof Parent_9); // true
		System.out.println(p instanceof Child1_9); // false
		System.out.println(p instanceof Child2_9); // false
		p = c1;
		System.out.println(p instanceof Child1_9); // true
		System.out.println(p instanceof Child2_9); // false
		p = c2;
		System.out.println(p instanceof Child1_9); // false
		System.out.println(p instanceof Child2_9); // true
	}
}
