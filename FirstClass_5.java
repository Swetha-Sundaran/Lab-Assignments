package day_4;

public class FirstClass_5 {
	int a = 100;
    public FirstClass_5 () {
        System.out.println("in the constructor of class FirstClass: ");
        System.out.println("a = "+a);
        a = 333;
        System.out.println("a = "+a);
    }
    public void setFirstClass_5( int value) {
        a = value;
    }
    public int getFirstClass_5() {
        return a;
    }

}
