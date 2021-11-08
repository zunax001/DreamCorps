import java.util.Scanner;

public class MiniCalculator {
	//Create an object of Scanner class
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		//Declare variables
		double firstTotal;
		double total;
		double firstNum;
		double secondNum;
		double thirdNum;
		String operator;
		String secondOperator;

		
		//Ask for 1st number
		System.out.println("This is a simple calculator. Please enter the first number: ");
		firstNum = userInput.nextDouble();
		userInput.nextLine();
		
		//Ask for 1st operator and makes sure the user only enters the available options
		do {
			System.out.println("Please enter only one of the following operators: +, - , /, or * ");
			operator = userInput.nextLine();
		} while (!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*"));
		
		//Ask for 2nd number
		System.out.println("Please enter the second number: ");
		secondNum = getNumber(operator);
		
		//Ask for 2nd operator and makes sure the user only enters the available options
		do {
			System.out.println("Please enter only one of the following operators: +, - , /, *, or enter \"N\" for not needed ");
			secondOperator = userInput.nextLine();
		} while (!secondOperator.equals("+") && !secondOperator.equals("-") && !secondOperator.equals("/") && !secondOperator.equals("*") && !secondOperator.equals("N"));
		
		//Ask for 3rd number
		System.out.println("Please enter the third number or \"N\" if not needed: ");
		thirdNum = 0;
		
		//If user inputs a double the getNumber method will be invoked else user entered N and will keep the variable thirdNum value = 0
		if(userInput.hasNextDouble()){
			thirdNum = getNumber(secondOperator);
		}
		
		//Invoke methods for first calculation
		firstTotal = calculation(firstNum,secondNum, operator);
		
		//If "N" is selected for operator variable firstTotal will print else it will invoke calculation method again and print variable total 
		if(secondOperator.equals("N") && thirdNum == 0) {
			System.out.println("Total = " + Math.round(firstTotal *100)/100.00);
		} else {
			total = calculation(firstTotal,thirdNum, secondOperator);
			System.out.println("Total = " + Math.round(total * 100)/100.00);
		}
		
	}
		//Method to return double inputs from user if the O is inserted and operator is / we will ask the user to enter another number
		public static double getNumber(String anyOperator) {
			double number = userInput.nextDouble();
			if (anyOperator.equals("/") && number == 0) {
				do {
					System.out.println("Please insert a number other than 0 to divide: ");
					number = userInput.nextDouble();
				}while(number == 0);
			}
			return number;
		}
		//Method that invokes corresponding methods to the operator. Returns the total 
		public static double calculation(double firstNum, double secondNum, String operator) {
			double firstTotal;
			if (operator.equals("+")){
				firstTotal = firstNum + secondNum;
			}else if (operator.equals("-")) {
				firstTotal = firstNum - secondNum;
			}
			else if (operator.equals("/")) {
				firstTotal = firstNum / secondNum;
			}
			else {
				firstTotal = firstNum * secondNum;
			}
			return firstTotal;
			
		}
		
}