package collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack);
		
		/* Finds the position of an element in the stack, starting from the top */
		int position = stack.search(10);
		System.out.println("Position of 10: " + position);

		/* Peeking at the top element */
		int topElement = stack.peek();
		System.out.println("Top element: " + topElement);

		/* Popping elements from the stack */
		int poppedElement1 = stack.pop(); // removes and returns the top element
		int poppedElement2 = stack.pop();
		System.out.println("Popped elements: " + poppedElement1 + ", " + poppedElement2);

		/* Checking if the stack is empty */
		boolean isEmpty = stack.isEmpty();
		System.out.println(isEmpty);

		/* Using a for loop with get(index) */
		System.out.println("\nUsing an for loop:");
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}

		/* Using an enhanced for loop */
		System.out.println("\nUsing an enhanced for loop:");
		for (Integer number : stack) {
			System.out.println(number);
		}

		/* Using an iterator */
		System.out.println("\nUsing an iterator:");
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		/* Clearing the stack */
		stack.clear();
		System.out.println("Stack after clearing: " + stack);

	}
}
