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

	

public class Assignme6 {

	static double avg(int a,int b,int c) throws ArithmeticException{
			return (a+b+c)/3;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			String[] name = new String[2];
			int subA = 0;
			int subB = 0;
			int subC = 0;
			System.out.println("Enter name of student:");
			name[i] = sc.next();

			try {				
				
				System.out.println("Enter marks:");

				if (sc.hasNextInt())
					subA=Integer.parseInt(sc.next());
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subB = Integer.parseInt(sc.next());
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subC = Integer.parseInt(sc.next());
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeException();
				if (subA > 100) throw new OutOfRangeException();
				
				if (subB < 0) throw new NegativeException();
				if (subB > 100) throw new OutOfRangeException();
				
				if (subC < 0) throw new NegativeException();
				if (subC > 100) throw new OutOfRangeException();
				
				
			} catch (ArithmeticException e) {
				System.out.println(e.getClass().getName());
			} catch (NegativeException e) {
				System.out.println(e);
			} catch (OutOfRangeException e) {
				System.out.println(e);
			}
			catch(NumberFormatException ne){
				System.out.println(ne.getClass().getName());
			}
			
			System.out.println("Name: " + name[i]);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
			System.out.println("Average of marks of: "+ avg(subA,subB,subC));
		}
		
		sc.close();

	}

}

