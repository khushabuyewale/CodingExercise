package Que1;

public class SampleArray {

	public static void main(String[] args) {
		int[] numbers = {1, 23, 36, 41, 50, 6, 79, 18, 99, 104}; 
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Sum of even numbers: " + sum);

	}

}
