package flowcontrol;
import java.util.Scanner;
public class If_else {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
    if(a>100) {
    	if(a%2==0) {
    		System.out.println("even number ");
    	}
    	else {
    		System.out.println("odd number");
    	}
    }
	}

}
