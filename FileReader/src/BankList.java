import java.util.ArrayList;
import java.util.Collection;

public class BankList {

	private static final long serialVersionUID = 1L;
	private ArrayList<Bank> bank;
	private static BankList banklist;
	
	//Defult constructor:
	
	public BankList() {
		bank = new ArrayList<Bank>();
		
	}
	
	public static BankList instance() {
		if(banklist == null) {
			return (banklist=new BankList());
		}else {
			return banklist;
		}
	}
	
	public void addBank(Bank b, Object bankName, Object type, Object city, Object state, Object zipcode) {
		bank.add(b);
	}	
	
}
