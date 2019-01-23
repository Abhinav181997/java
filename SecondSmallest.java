import java.util.Scanner;

public class SecondSmallest
{  
public static int getSecondSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];
}  
public static void main(String args[])
{  
  
System.out.println("Input the length of an array");
@SuppressWarnings("resource")
Scanner scan=new Scanner(System.in);
     int len=scan.nextInt();
	 int[] a =new int[len];
	 System.out.println("Enter the array");
	 for(int i=0;i<len;i++)
	 {
		a[i]=(int) scan.nextInt();
	 }
 
System.out.println("Second smallest: "+getSecondSmallest(a,len));  
 
}
}  