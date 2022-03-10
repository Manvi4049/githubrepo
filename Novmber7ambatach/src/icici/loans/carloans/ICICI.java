package icici.loans.carloans;

public class ICICI implements Rbi
{

	public static void main(String[] args) {
       
		ICICI i = new ICICI();
		  i.withdrawl();
		  i.deposit();

	}

	@Override
	public void withdrawl() {
		System.out.println(" iam override from icici");
		
	}

	@Override
	public void deposit() {
		System.out.println(" i  am  override from icic");
		
	}

}
