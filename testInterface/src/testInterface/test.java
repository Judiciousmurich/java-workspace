package testInterface;

interface A{
	void display();
}
interface B{
	void show();
}
class C implements A,B{
	

	public void display() {
		System.out.println("This is a programming class");
	}

	public void show() {
		System.out.println("Welcome");
		
	}
}
public class test {

	public static void main(String[] args) {
		C obj = new C();
		obj.display();
		obj.show();

	}

}
