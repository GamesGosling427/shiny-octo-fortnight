package all_program;

public class End_divide {

	public static void main(String[] args) {
		int i=1;
		while(i<=1000)
		{
			if(i%10==7 && i/7==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
