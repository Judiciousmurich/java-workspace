package superConstructor;

class Animal {
	Animal(){
		System.out.println("animal created");
	}
}
	class Dog extends Animal{
		Dog(){
			super();
			System.out.println("Dog created");
		
	}
}
public class testSuper3 {

	public static void main(String[] args) {
		Dog d = new Dog();

	}

}
