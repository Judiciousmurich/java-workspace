package addingNumbers;

public class sum {
	int num1=30;
	int num2=25;
	int num3=20;
	
	sum(int num1,int num2,int num3){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	float compare () {
		return (num1 + num2)/2;
	}

	public static void main(String[] args) {
		sum obj =new sum(70,80,60);
		System.out.println(obj.add());

	}

}
