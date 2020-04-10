import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;
public class MathOperation {

	public static void main(String[] args) {
		int len=args.length;
		int [] arr=new int[len];
		int sum=0;
		double avg=0;
		try{
			for (int i=0;i<len;i++) { 
				arr[i]=Integer.parseInt(args[i]);
				sum=sum+arr[i];
			}
			avg=sum/len;
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		}
		catch(InputMismatchException ie) {
			System.out.println("InputMismatchException");
		}

	}

}
