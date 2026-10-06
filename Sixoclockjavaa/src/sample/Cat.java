package sample;

public class Cat {
	public void animal() {
		System.out.println("meow");
	}
	
	public static void main(String[]args) {
		Cat obj = new Cat();
		obj.animal();
		
		Dog obj1= new Dog();
		obj1.animal();
	}

}
