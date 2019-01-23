import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
System.out.println("Enter marks of Student");
Scanner scan=new Scanner(System.in);
int marks=scan.nextInt();

if(marks>50 && marks<60)
	System.out.println("Pass");
else if(marks>60 && marks<74)
	System.out.println("First Class");
else if(marks>74)
	System.out.println("Dictintion");
else
	System.out.println("Fail");
}

}
