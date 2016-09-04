package generic;

public class Tester {
	public static void main(String args[]){
		GenericStack<String> stack = new GenericStack<String>(4);
		stack.push("Messi");
		stack.push("Iniesta");
		stack.push("Suarez");
		stack.push("Neymar");
		System.out.println(stack.search("Iniesta"));
		stack.pop();
		System.out.println(stack.full());
		stack.push("Pique");
		System.out.println(stack.full());
	}
}
