package inheritance_program1;

public class Savaing_acc extends Bank{
	String ac_name;
	int ac_bank;
	double balance;
	Savaing_acc()
	{
	}
	
		Savaing_acc(String bank_name, String ifsc,String ac_name, int ac_bank, double balance){
			super(bank_name,ifsc);
			this.ac_name=ac_name;
			this.ac_bank=ac_bank;
			this.balance=balance;
			
		}

		

		public void DisplaySavaing_ac()
		{
			System.out.println("ac_name is"+ac_name);
			System.out.println("ac_bank is"+ ac_bank);
			System.out.println("balance is"+balance);
		}
}
