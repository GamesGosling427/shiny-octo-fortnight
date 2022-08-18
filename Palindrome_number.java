package all_program;
import java.util.Scanner;
public class Palindrome_number {
	 public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a=n;
		int rem=0;     //rem=reminder
		int rev=0;      //rev=reverse
		while(n>0)
		{
			rem=n%10;   //getting reminder
			rev=10*rev+rem;
			n=n/10;
		}
		if(a==rev)
		{
			System.out.println("it is perindrome number ");
	}
		else
		{
			System.out.println("it is not a Perindrome number");
		}

	}
}
