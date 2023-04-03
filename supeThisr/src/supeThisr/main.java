package supeThisr;
class Animal{
		private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println(" The animal makes a sound");
	}
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void speak(){
		System.out .println("The dog barks");
	}

	
	
	
	}


public class main {

	public static void main(String[] args) {
		Dog dog = new Dog("Fido");
		System.out.println("Name:"+ dog.getName);
		dog.speak();

	}

}
