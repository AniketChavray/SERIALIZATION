package


com.velocity;

public class Dog extends Animal{
	
	
	public void m1(){
		
		System.out.println("Dog method");
	}

	
	public static void main(String args []) {
		
		
		Animal anm = new Dog();
		
		Dog dog = (Dog)anm;
		
	}
}
