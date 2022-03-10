package icici.loans.carloans;

public class HDFC implements Rbi
{

	public static void main(String[] args) {
		 HDFC   i = new HDFC ();
		  i.withdrawl();
          i.deposit();
	}

	@Override
	public void withdrawl() {
		
		System.out.println(" iam override from hdfc");
	}

	@Override
	public void deposit() {
		System.out.println(" iam override from hdfc");		
	}

}
