package day_4;

public class OOPExercise4 {
	 public static void main(String[] args) {
	        A objA = new A();
	        System.out.println("in main(): ");
	        System.out.println("objA.a = "+objA.a); //ObjA.a is not visible because it is a private
	        objA.a = 222;
	    }
	}
	class A {  //public class must be defined its own file  so remove public or define another file name A
	    int a = 100;
	    public void setA( int value) {
	        a = value;
	}
	    public int getA() {
	        return a;
	    }

}
