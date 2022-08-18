package inheritance_program1;

public class Loan extends Savaing_acc{
	  
	String loan_number;
	   double loan_Amount;
	   
	   Loan()
	   {
	   }  
		 Loan(String bank_name,String ifsc, int acc_bank,String acc_name,double balance,String loan_number,double loan_Amount)  
		 {
			 
			 super(bank_name, ifsc, acc_name, acc_bank, balance);
			 this.loan_number=loan_number;
			 this.loan_Amount=loan_Amount;
			 
			 
	   }
		 
		 public void displayLoan()
		 {
			 System.out.println("loan number is:"+loan_number);
			 System.out.println("loan AMount is :"+loan_Amount);
			 System.out.println("====================");
		 }
		
			
			
		}


