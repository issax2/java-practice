package calc;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to the onedigit calcultor!");
	
		
		
		System.out.println("enter the first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number");
		double num2 =scan.nextDouble();
		System.out.println("enter the method: -,+,*,/");
		char method = scan.next().charAt(0);
		double result =0;
		scan.close();

		if (method == '-') result = num1-num2;
		else if (method == '+') result = num1+num2;
		else if (method == '*') result = num1*num2;
		else if (method == '/') result = num1/num2;
		else System.out.println("error occured try again later!");
		
		System.out.println(result);
	
	}
}
