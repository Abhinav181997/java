import java.util.Scanner;

public class MenuBased {

	public static void main(String[] args) {
	
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MUL");
		System.out.println("4. DIV");
		System.out.println("5. EXIT");
		
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number");
int a=scan.nextInt();
System.out.println("Enter the second number");
int b=scan.nextInt();
System.out.println("Enter the choice");
int choice=scan.nextInt();

switch(choice)
{
case 1: int add=(a+b);
		System.out.println("addition is:"+add);
		break;		
case 2: int sub=(a-b);
		System.out.println("subtraction is:"+sub);
		break;
case 3: int mul=(a*b);
		System.out.println("multiplication is:"+mul);
		break;
case 4: int div=(a/b);
		System.out.println("division is:"+div);
		break;

case 5: System.out.println("EXIT");
		break;
default: System.out.println("Wrong choice entered");
         break;
         
}
	}

}
