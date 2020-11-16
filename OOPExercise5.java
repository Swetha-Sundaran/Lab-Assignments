package day_4;

public class OOPExercise5 {
	public static void main(String[] args) {
        FirstClass_5 objA = new FirstClass_5();
        SecondClass_5 objB = new SecondClass_5();
        System.out.println("in main(): ");
        System.out.println("objA.a = "+objA.getFirstClass_5());
        System.out.println("objB.b = "+objB.getSecondClass_5());
        objA.setFirstClass_5 (222);
        objB.setSecondClass_5 (333.33);
        System.out.println("objA.a = "+objA.getFirstClass_5());
        System.out.println("objB.b = "+objB.getSecondClass_5());
    }

}
