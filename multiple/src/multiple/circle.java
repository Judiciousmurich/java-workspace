package multiple;
interface shape{
	void draw();
}
interface color{
	void fill();
}
class oval implements shape,color{
	public void draw() {
		System.out.println("Drawing circle");
	}
	public void fill() {
		System.out.println("filling circle");
	}



		
	}


public class circle {

	public static void main(String[] args) {
		oval  obj = new oval();
		obj.draw();
		obj.fill();

	}

}
