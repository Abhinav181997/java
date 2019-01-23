import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
System.out.println("Input the number which you want to check");
Scanner scan=new Scanner(System.in);
int input=scan.nextInt();
System.out.println(powerOfTwo(input));
	}

	private static boolean powerOfTwo(int input) {
		
		if(input%2!=0 || input==0)
			return false;
		else if(input ==2 || input ==1)
			return true;
		else 
			return powerOfTwo(input/2);

	}

}
