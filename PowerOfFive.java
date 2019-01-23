import java.util.Scanner;

public class PowerOfFive {

	public static void main(String[] args) {
		
System.out.println("Input the number which you want to check");
Scanner scan=new Scanner(System.in);
int input=scan.nextInt();
System.out.println(powerOfFive(input));
	}

	private static boolean powerOfFive(int input) {
		
		if(input%5!=0 || input==0)
			return false;
		else if(input ==5)
			return true;
		else 
			return powerOfFive(input/5);
	}

}
