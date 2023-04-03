package singles;


public class singleInheritance  extends fruits{

	singleInheritance(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruits f = new fruits("Orange" , 78);
		f.display();
	}

}
