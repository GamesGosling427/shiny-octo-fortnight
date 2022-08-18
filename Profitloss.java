package conditional;
import java.util.Scanner;
public class Profitloss {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of sp");
	double sp=sc.nextDouble();
	System.out.println("enter the valu of cp");
	double cp=sc.nextDouble();
	if(sp>cp) 
	{
		System.out.println("this is profit");
		double profit=sp-cp;
		double prprofit=profit*100/cp;  
		System.out.println("profit percent is:"+prprofit);
	}
		if(cp>sp)
		{
			System.out.println("this is loss");
			double loss=cp-sp;
			double prloss =loss*100/cp;
			System.out.println("loss percent is:"+prloss);
		}
			else 
			{
				System.out.println("there is no profit not loss");
			}

	}

}
