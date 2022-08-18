package encapsulation;
import java.util.Scanner;
public class Employ_1 
{
	static int pwd=12345;
	private String name;
	private String Salary;
	
	public void setName(String name) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Password");
		int Password =sc.nextInt();
		if(pwd==Password) 
		{
			this.name=name;
			}
		else
		{
			System.out.println("invalid password name is not set");
		}
	}

	public void setSalary(String salary) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Password");
		int Password =sc.nextInt();
		if(pwd==Password) 
		{
			this.Salary=salary;
			}
		else
		{
			System.out.println("invalid password salary is not set");
		}
	}
	public String getName() {
	     return name;
      }
      
  public String getSalary() {
    	
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the Password");
		int password=sc.nextInt();
		if(pwd==password) 
		{
			return Salary;
		}
		else
		{
			return "invalid password salary  is not found";
		}
		
		
    }
	

}

