package conditional;
import java.util.Scanner;
public class Evenodd {
		//System.out.println(n%2==0?"number is even":"number is odd");
	   //System.out.println(n%100==0?"it is centuary":"it is not a centuary");
	  //System.out.println(n%10==7?"last digit is 7":"last digit is not 7");
	// System.out.println(n>0?"number is positive":"number is nagative");

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the number");
		int b=sc.nextInt();
		int big=a>b?a:b;
		System.out.println("bigger number is:"+big);
	}
	}
