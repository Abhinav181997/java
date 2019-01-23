import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

int fact=1;
Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
int n=sc.nextInt();
	fact=factorial(n);
 
	System.out.println("factorial of a given number is:"+fact);
 	
}

	private static int factorial(int i) {
		
		if(i==0)
			return 1;
		else
		return (i*factorial(i-1));
	}

}