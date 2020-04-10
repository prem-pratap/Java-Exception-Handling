import java.lang.ArithmeticException;
import java.util.Scanner;

public class Assignment5 {
	static double division(int a,int b) throws ArithmeticException{
		return a/b;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			double res=division(a,b);
			System.out.println("Result is "+res);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getClass().getName());
		}
		finally {
			sc.close();
		}
	}

}
