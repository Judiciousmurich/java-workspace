package polymorohism;

public class TestPoly {
	public void print (int num) {
		System.out.println("Printing an integr:" + num);
		
	}
	public void print(double num) {
		System.out.println("Priing a double:" + num);
	}
	public  void print(String str) {
		System.out.println("printing a string:" + str);
	}
	public static void main(String[] args) {
		TestPoly obj = new TestPoly();
		obj.print(10);
		obj.print(10.0);
		obj.print("Hello World");

	}

}