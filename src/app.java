import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter a Number Less Than 100 : ");
		Scanner sc = new Scanner(System.in);
		try {
		int x = sc.nextInt(); 
	
		int Q= x / 25;
		int q = x%25;
		int D= q/ 10;
		int N= ((x -Q*25)-(D*10))/5;
		int P= ((x -Q*25)-(D*10))-(N*5)/1;
	
		System.out.println("Pennies :"+P);
		System.out.println("Nickles : "+N);
		System.out.println("Dimes : "+D);
		System.out.println("Quaters : "+Q);
	}
		catch(Exception e){
			System.out.println("input is invalid. Try again");
		}
}
}	
		
		