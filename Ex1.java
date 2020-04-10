class Ex1{
public static void main(String[] args){
	try{
		int i=Integer.parseInt(args[0]);
		System.out.println(i);
		}
	//System.out.println("Wipro"); if we un comment this statement thene it will show compilation error 
/*	catch(RuntimeException e){
	System.out.println(e);}*/
	catch(NumberFormatException e){
		System.out.println(e);



		}
	}
}
