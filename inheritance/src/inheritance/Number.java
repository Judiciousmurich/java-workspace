package inheritance;

public class Number {
	static int i = 10;
	Number(){
		System.out.println("value of i in Base class is:" + i );
	}

class calculate extends Number{
	calculate(){
		super();
		System.out.println("value of i in child class is:" + i);
	}
}

class test{
	public static void main(String[] args) {

calculate k = new calculate();
		}
	}

}