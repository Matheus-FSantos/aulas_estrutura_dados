package Pilha;

public class Teste {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(2);
		
		System.out.println(stack.invertedPrint());
		
		stack.push(4);
		stack.push(3);
		stack.push(1);
		
		System.out.println("\n\n" + stack.invertedPrint());
		
		stack.pop();
		
		System.out.println("\n\n" + stack.normalPrint());
		System.out.println("Total items in stack: " + stack.getSize());
		
		stack.reboot();
		
		System.out.println("\n\n" + stack.normalPrint());
		System.out.println("Total items in stack: " + stack.getSize());
	}
}