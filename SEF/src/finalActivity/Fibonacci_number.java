package finalActivity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci_number {

	public static void main(String[] args) {

		int x = 1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Fibonacci sequence of length: (enter an integer)");
		try {
			x = keyboard.nextInt();
			if (x < 48) {
				Fibonacci(x);
			}
			else {
				System.out.println("Integers above 47 cause an overflow");
			}
		} catch (InputMismatchException d){
			System.out.println("Only integer values allowed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter a number larger than 0");
		}
	}

	public static void Fibonacci(int x) {
		int fibonaccies[] = new int[x+1];
		
		fibonaccies[0] = 0;
		fibonaccies[1] = 1;
		
		System.out.print(fibonaccies[0]);
		if (x >= 2) {
			for (int i = 1; i < (fibonaccies.length-1); i++) {
				System.out.print(", " + fibonaccies[i]);
				fibonaccies[i+1] = fibonaccies[i] + fibonaccies[i -1];
			}
		}
	}
}
