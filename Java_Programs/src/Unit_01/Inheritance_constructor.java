package Unit_01;

public class Inheritance_constructor {
	public static void main(String[] args) {
		inherit obj1 = new inherit();
		System.out.println();
		inherit obj2 = new inherit(10);
	}
}

class base{
	base(){
		System.out.println("Hello Buddy from base class(Default)");
	}
	base(int a){
		System.out.println("Hello Buddy from base class(Parameterized)");
	}
}

class inherit extends base{
	inherit(){
		System.out.println("Hello Buddy from inherited class(Default)");
	}
	
	inherit(int a){
		super(2);
		System.out.println("Hello Buddy from inherited class(Parameterized)");
	}
}
