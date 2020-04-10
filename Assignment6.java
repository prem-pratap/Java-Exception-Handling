import java.lang.NumberFormatException;
import java.lang.Exception;
import java.util.Scanner;

 class NegativeException extends Exception {
	void NegativeExceptiion() {
		System.out.println("Negative Value Exception Occured");
	}
}
 class OutOfRangeException extends Exception {
		void OutOfRange() {
			System.out.println("Out of range exception occured");
		}
	}


public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			
			try {				
				name = sc.nextLine();
				
				if (sc.hasNextInt())
					subA = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subB = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subC = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeException();
				if (subA > 100) throw new OutOfRangeException();
				
				if (subB < 0) throw new NegativeException();
				if (subB > 100) throw new OutOfRangeException();
				
				if (subC < 0) throw new NegativeException();
				if (subC > 100) throw new OutOfRangeException();
				
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeException e) {
				System.out.println(e.getMessage());
			} catch (OutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
		
		sc.close();

	}

}
