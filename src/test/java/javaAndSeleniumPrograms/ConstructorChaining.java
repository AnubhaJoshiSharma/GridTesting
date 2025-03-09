package javaAndSeleniumPrograms;

public class ConstructorChaining {
	public static void main(String[] args) {
	ConstructorChaining cc = new ConstructorChaining();
	}
	
	public ConstructorChaining() {
		this(10,20);
		System.out.println("No Arg Constructor");
			}
	
	public ConstructorChaining(int i,int j) {
		System.out.println(i);
		System.out.println(j);
		
	}

}
