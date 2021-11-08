import java.util.Scanner;
public class Currency {

	public static void main(String[] args) {
		//Declare currencies
		double pesos;
		double quetzals;
		double colons;
		// Ask for the amount of each currency
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter number of Mexican Pesos: ");
		pesos = userInput.nextDouble();
		//Makes sure user inputs a number equal to or above 0
		while (pesos < 0) {
			System.out.print("Please enter Pesos greater than or equal to 0: ");
			pesos = userInput.nextDouble();
		}
		System.out.print("Enter number of Guatemalan Quetzals: ");
		quetzals = userInput.nextDouble();
		//Makes sure user inputs a number equal to or above 0
		while (quetzals < 0) {
			System.out.print("Please enter Quetzals greater than or equal to 0: ");
			quetzals = userInput.nextDouble();
		}
		System.out.print("Enter number of Salvadoran Colons: ");
		colons = userInput.nextDouble();
		//Makes sure user inputs a number equal to or above 0
		while (colons < 0) {
			System.out.print("Please enter Colons greater than or equal to 0: ");
			colons = userInput.nextDouble();
		}
		
		//Convert to dollars and add them together
		double totalDollars = (fromPesos(pesos)) + (fromQuetzals(quetzals)) + (fromColons(colons));
		//Provides only 2 decimal points like in dollar
		totalDollars = Math.round(totalDollars * 100)/ 100.00;
		//Print total dollars
		System.out.println("US Dollars= " + totalDollars);
		
	}
	//Method to convert pesos to dollars
	public static double fromPesos(double currency) {
		final double DOLLARINPESOS = 0.0544;
		double dollar = currency * DOLLARINPESOS;
		return dollar;
		
	}
	//Method to convert quetzals to dollars
	public static double fromQuetzals(double currency) {
		final double DOLLARINQUETZALS = 0.1305;
		double dollar = currency * DOLLARINQUETZALS;
		return dollar;
	}
	//Method to convert colons to dollars
	public static double fromColons(double currency) {
		final double DOLLARINCOLONS = 0.1144;
		double dollar = currency * DOLLARINCOLONS;
		return dollar;
	}
}
