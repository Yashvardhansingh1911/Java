package Unit_01;

public class First {
	public static void main(String[] args) {
		System.out.println("Hello World(Main method)");
		main("Hello");
		main(4);
		main(4.5f);
	}
	public static void main(String args) {
		System.out.println("Hello World(Called Function)");
	}
	
	public static void main(int x) {
		System.out.println("Hello World(Called Function)-Integer");
	}
	
	public static void main(float b) {
		System.out.println("Hello World(Called Function)-Float");
	}
}
