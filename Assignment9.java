import java.lang.ArithmeticException;
import java.util.Scanner;

public class Assignment9 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int quo=a/b;
			System.out.println("The quotient of "+a+"/"+b+" = "+quo);
		}
		catch(ArithmeticException ae){
			System.out.println("DivideByZeroException caught");
		}
		finally {
			sc.close();
			System.out.println("Inside finally block");
		}
	}

}
