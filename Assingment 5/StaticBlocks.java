class A {
	
	static {
		System.out.println("Static Block Called");
	}
}

public class StaticBlocks {

	public static void main(String[] args) {
		
		A obj = new A();
	}

}
