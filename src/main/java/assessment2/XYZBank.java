package assessment2;

import java.util.Date;

public class XYZBANK {
	static {
		Account a1 = new SavingsAccount("Swapnika Mishra", new Address("06","Time residency	","Nashik","Maharashtra",422006,99887766), "Savings", 36000,new Date(),STATUS.ACTIVE);
		Account a2 = new DematAccount("Rahul kalva", new Address("LIG219","Preetam Nagar","Prayagraj","UttarPradesh",211011,88995544), "Demat", 80000, new Date(),STATUS.INACTIVE);
		Account a3 = new CurrentAccount("Ishika Sharma", new Address("301","Upnagar","Nagpur","Maharashtra",403252,77885544), "Current", 235600,new Date(),STATUS.ACTIVE);
		System.out.println("Ammount Initialised");
	}

}
