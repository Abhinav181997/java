import java.util.Scanner;

public class PowerOfTen {

	public static void main(String[] args) {
		
System.out.println("Input the number which you want to check");
Scanner scan=new Scanner(System.in);
int input=scan.nextInt();
System.out.println(powerOfTen(input));
	}

	private static boolean powerOfTen(int input) {
		
		if(input%10!=0 || input==0)
			return false;
		else if(input ==10)
			return true;
		else 
			return powerOfTen(input/10);
		
	}

}
