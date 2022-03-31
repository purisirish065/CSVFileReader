

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BankService {
		String line = "";
		public void SaveBankDetails() throws IOException {
			
			
			try {
				BufferedReader br = new BufferedReader(new FileReader("/Users/prakritikhatiwada/Downloads/ProgrammingAssignment.csv"));
				while((line =br.readLine())!= null) {
					String [] data = line.split(",");
					Bank bank = new Bank();
					bank.setId(data[0]);
					bank.setBankName(data[1]);
					bank.setType(data[2]);
					bank.setCity(data[3]);
					bank.setState(data[4]);
					bank.setZipCode(data[5]);
					System.out.println(data[0] +" "+  data[1] + " "+ data[2] + " "+ data[3] + " "+  data[4] +" " +data[5] );
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

