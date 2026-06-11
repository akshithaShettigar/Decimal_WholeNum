//Seperate the decimal part from whole number using method and user input
import java.util.Scanner;
class TypeCon {
	double value;
	TypeCon(double value){
		this.value=value;
	}
	void calculation() {
		int whole=(int)value;
		double fractional=(float)value-whole;
		System.out.println("The result is :"+whole+ " "+fractional );
	}
}
class Decimal{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values:");
		double value=sc.nextDouble();
		TypeCon v1= new TypeCon(value);
		v1.calculation();
	}
}