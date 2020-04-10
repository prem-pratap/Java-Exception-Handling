import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int ele=sc.nextInt();
		int []arr=new int[ele];
		System.out.println("Enter the elements in array");
		for(int i=0;i<ele;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the index of the array element you want to access");
		int index=sc.nextInt();
		
		try {
			System.out.println("The array element at index "+index+" = "+ arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getName());//printing only the class name of exception
		}
		sc.close();
	}

}
