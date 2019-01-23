import java.util.Scanner;
public class StratsWithS {

	public static void main(String[] args) {
	String s = null;
System.out.println("Input the number of strings");
@SuppressWarnings("resource")
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();

String[] str=new String[n];
System.out.println("Input the strings");
for(int i=0;i<n;i++)
{
	str[i]=scan.next();
	}

for(int i=0;i<n;i++)
{
	s=str[i];
	if(s.charAt(0)=='s' || s.charAt(0)=='S')
		
		System.out.println(str[i]);
		}
	}

}
