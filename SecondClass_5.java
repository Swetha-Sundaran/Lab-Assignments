package day_4;

public class SecondClass_5 {
	double b = 123.45;
    public SecondClass_5() {
        System.out.println("-----in the constructor of class B: ");
        System.out.println("b = "+b);
        b = 3.14159;
        System.out.println("b = "+b);
    }
    public void setSecondClass_5( double value) {
        b = value;
    }
    public double getSecondClass_5() {
        return b;
    }

}
