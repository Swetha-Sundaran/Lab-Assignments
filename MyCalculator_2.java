package day_4;

public class MyCalculator_2 implements AdvancedArithmetic_2{
	@Override
	public int divisorSum(int num) {
		int sum = num + 1;
		for(int divisor = 2; divisor <= num/2; divisor++) {
			if(num % divisor == 0) {
				sum = sum + divisor;
			}
		}
		return sum;
	}

}
