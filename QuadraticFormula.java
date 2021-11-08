package Practice;
import java.util.Scanner;
public class QuadraticFormula {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner userInput = new Scanner(System.in);
		
		//Ask user for a
		System.out.print("Enter a: ");
		double a = userInput.nextDouble();
		
		//Ask user for b
		System.out.print("Enter b: ");
		double b = userInput.nextDouble();
		
		//Ask user for c
		System.out.print("Enter c: ");
		double c = userInput.nextDouble();
		
		//Invoke methods for each root
		double rootOne = rootOne( a, b, c);
		double rootTwo = rootTwo(a, b, c);
		
		//Print root 1 and 2 and round to 6 decimal places
		System.out.println("Root 1 is " + (Math.round(rootOne * 1000000)/1000000.000000));
		System.out.println("Root 2 is " + (Math.round(rootTwo * 1000000)/1000000.000000));

		
	}
	//Provides sqrt of b^2 - (4 * a * c)
	public static double sqrtAbc(double a, double b, double c) {
		double bPow = b * b;
		double diff = bPow - (4 * a * c);
		/*Java cannot take the sqrt of a negative number to fix this error we exit the program 
		 and let user know there a no real roots
		 */
		if (diff < 0) {
			System.out.println("There are no real roots ");
			System.exit(0);
		}
		double sqrt = Math.sqrt(diff);
		return sqrt;
	}
	//Provides root 1 which b is added 
	public static double rootOne(double a, double b, double c) {
		double sqrt = sqrtAbc(a, b, c);
		double bSum = - b + sqrt;
		double rootOne = bSum / (2 * a);
		return rootOne;
	}
	//Provides root 2 which b is subtracted
	public static double rootTwo(double a, double b, double c) {
		double sqrt = sqrtAbc(a, b, c);
		double bDiff = - b - sqrt;
		double rootTwo = bDiff / (2 *a);
		return rootTwo;
	}
}
