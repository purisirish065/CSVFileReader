import java.io.Serializable;
import java.util.Collection;

public class Bank implements Serializable{
		private static final long serialVersionUID = 1L;
		private int id;
		private String BankName;
		private String Type;
		private String City;
		private String State;
		private String ZipCode;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBankName() {
			return BankName;
		}
		public void setBankName(String bankName) {
			BankName = bankName;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getZipCode() {
			return ZipCode;
		}
		public void setZipCode(String zipCode) {
			ZipCode = zipCode;
		}
		public void setId(String string) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public String toString() {
			return "Bank [id=" + id + ", BankName=" + BankName + ", Type=" + Type + ", City=" + City + ", State=" + State
					+ ", ZipCode=" + ZipCode + "]";
		}
		
		
		

	}

