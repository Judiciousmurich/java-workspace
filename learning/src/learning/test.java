package learning;
 class Shape{
	 static int length;
	 static int height;
	 static int width;
	 Shape(int length, int height, int width){
		 this.length = length;
		 this.height = height;
		 this.width = width;
	 }
 }
class Rectangle extends Shape{
	Rectangle(){
		super( length, height, width);
	}
		
	public void calculate(int l,int w) {
		int area;
		area = (l * w);
		System.out.println("Area of Recangle = " + area);
	}
}
class Square extends Shape{
	Square (){
		super(length, height, width);
	}
	public void Sqr(int l) {
		int area = (l * l);
		System.out.println("Area of square is " + area);
	}

}
public class test {
public static void main(String[] args) {
	
	Square s = new Square();
	s.Sqr(10);
	
	Rectangle s2 = new Rectangle();
	
	s2.calculate(6, 8);
	}
}
	
	

