package Practice;
import java.util.Stack;

public class StackLecture {
	public static int top = -1;
	public static Stack <String> chips = new Stack <String>();
	public static void main(String[] args) {
		//Initial top index
		System.out.println("The initial top index is " + top(chips) + ".");
		//Adds elements to the Stack
		push(chips, "hot cheetos");
		System.out.println("The top is at index " + top(chips) +".");
		
		push(chips, "lays");
		System.out.println("The top is at index " + top(chips) + ".");
		
		
		push(chips, "ruffles");
		System.out.println("The top is at index " + top(chips) + ".");
		
		//Prints the elements of the Stack, current amount of elements, and the capacity
		System.out.println("The Stack contains the following elements: " + chips + ". The length of the Stack is " + chips.size() + " and the capacity is " + chips.capacity() 
		+".");
		
		
		//Pop the value at the top
		System.out.println("We popped "+ pop(chips)+ ".");
		
		//Print out the elements in the Stack, current amount of elements, and the capacity
		System.out.println("The Stack has the following elements: " + chips + ". The length of the Stack is " + chips.size() + " and the capacity is " + chips.capacity() 
		+".");
		
		//Print the top 
		System.out.println("The top is at index " + top(chips) + ".");
		
		//Checks if Stack is empty
		System.out.println("The Stack is empty? That's " + isEmpty(chips) + "!");	
		
		//Checks if Stack contains "lays"
		System.out.println("The Stack contains lays? That's " + contains(chips, "lays") + "!");
		
	}
	//Adds elements to Stack
	public static void push(Stack<String> chips, String chip) {
		chips.add(chip);
	   top = chips.size()- 1;
	}
	//Pop the element at the top index
	public static String pop(Stack<String> chips) {
		String currentChip = chips.remove(top);
		top = chips.size() -1;
		return currentChip;
		
	}
	//Provides current top
	public static int top(Stack<String> chips) {
		top = chips.size() - 1;
		return top;
	}
	//Returns boolean if the Stack is empty
	public static boolean isEmpty(Stack <String> chips) {
		return top == -1;
	}
	//Returns if Stack contains the target
	public static boolean contains(Stack<String> chips, String chip) {
		for (int i = 0; i < chips.size(); i++) {
			if(chips.get(i).equals(chip)){
				return true;
			}
		}
		return false;
	}

}
