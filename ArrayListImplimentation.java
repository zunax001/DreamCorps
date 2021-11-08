package Practice;
import java.util.*;

public class ArrayListImplimentation {

	public static void main(String[] args) {
		//Create ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Add integers to ArrayList
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(8);
	
		//Print the ArrayList
		System.out.println("My current ArrayList is: " + list);
		
		//Find the index of int 1
		System.out.println("Number 1 is at index: " + indexOf(list, 1));
		
		System.out.println("The ArrayList contains number 10? That's " + contains(list, 10) + "!");
		
		//Sorts the ArrayList
		System.out.println("The sorted ArrayList: " + sort(list));
		
		//Reverse the sorted ArrayList
		System.out.println("Now let's reverse it " + reverse(list));
		
		//Clones the sorted ArrayList
		System.out.println("Let's copy it! " + clone(list));

	}
	
	public static int indexOf(ArrayList<Integer> list, int target) {
		for ( int index = 0; index < list.size() ; index++) {
			if (list.get(index) == target) {
				return index;
			}
		}
		return -1;
	}
	public static boolean contains(ArrayList<Integer> list, int target) {
		for ( int index = 0; index < list.size() ; index++) {
			if (list.get(index) == target) {
				return true;
			}
		}
		return false;
	}

	public static  ArrayList<Integer> sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() ; i++) {
		for (int index= 0; index < list.size(); index++) {
			if (index > 0 && list.get(index)< list.get(index - 1)) {
				int value = list.get(index - 1);
				int valueTwo = list.get(index);
				list.set(index -1 , valueTwo);
				list.set(index, value);
			}
			}
		}
		return list;
	}
	public static ArrayList<Integer> reverse(ArrayList<Integer> list){
		ArrayList<Integer> reverseList = new ArrayList<Integer>();
		for ( int index = list.size() -1 ; index >= 0; index--) {
			reverseList.add(list.get(index));
		}
		return reverseList;
			
		}
	public static ArrayList<Integer> clone(ArrayList<Integer> list){
		ArrayList<Integer> clone = new ArrayList<Integer>();
		for (int i = 0 ; i < list.size() ;i++) {
			clone.add(list.get(i));
		}
		return clone;
	}
	}

