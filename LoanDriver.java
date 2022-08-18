package inheritance_program1;

public class LoanDriver {

	public static void main(String[] args)
	{
		Loan L=new Loan("HDFC", "ifsc1231", 5435645, "mr.Rohan kumar", 7.7283, "DMI23434", 4353.243);
		L.Displaybank();
		L.displayLoan();
		L.DisplaySavaing_ac();

	}

}
