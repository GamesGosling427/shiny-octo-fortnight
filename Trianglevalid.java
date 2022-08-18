package conditional;
import java.util.Scanner;
public class Trianglevalid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value");
		int a=sc.nextInt();
		System.out.println("enter the second value");
		int b=sc.nextInt();
		System.out.println("enter the third value");
		int c=sc.nextInt();
		if(a+b>c&&b+c>a&&c+a>b)
		{
			System.out.println("this is triangle valid");
			}
		else {
			System.out.println("this is not triangle valid");
		}

	}

}
