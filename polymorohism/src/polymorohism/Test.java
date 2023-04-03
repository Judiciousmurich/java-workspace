package polymorohism;
class Numbers{
	public void calculate(int a, int b) {
		int result = a * b;
		System.out.println("Result is = "+ result);
	}
	public void calculate(int a,int b,float c) {
		int result (a + b) /c);
		System.out .pritln("Result is =" + Result);
	}
	public void calculate (float a,float b,float c);
	{
		float R = (9/100) * (b + c);
		System.out.println("Result is +" + R);
	}


public class Test {

	public static void main(String[] args) {
		Numbers  n = new Numbers();
		n.calculate(5,10);
		n.calculate(6 ,8,10.5);
		n.calculate(5.2, 6.3, 10.2 );

	}

}
}