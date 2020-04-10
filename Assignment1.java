import java.lang.NumberFormatException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		try {
			int num=Integer.parseInt(sc.next());
			System.out.println("The square value is:"+num*num);
			System.out.println("The work has been done successfully");
			
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		sc.close();
	}

}
