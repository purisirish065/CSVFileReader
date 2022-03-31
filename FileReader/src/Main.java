import java.io.IOException;

public class Main {

	private static Object Zipcode;
	private static Object State;
	private static Object City;
	private static Object Type;
	private static Object BankName;
	private static Bank id;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		BankService bs= new BankService();
		BankList bl = new BankList();
		bl.addBank(id, BankName, Type, City, State, Zipcode);
		bs.SaveBankDetails();
		b.toString();
	}

}
