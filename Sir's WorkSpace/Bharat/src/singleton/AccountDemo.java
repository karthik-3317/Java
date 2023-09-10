package singleton;
import singleton.Account;
import java.util.Scanner;
public class AccountDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Account upi= Account.getObject();
		Account atm =Account.getObject();
//		System.out.println(upi.name);
	    boolean yes=true;
	    while(yes)
	    {
	    	System.out.println("1.Update your name 2.Deposit 3.Withdrawl 4.Current Balance 5.Details");
	    	switch(sc.nextInt())
	    	{
	    	case 1:
	    		System.out.println("Enter your Name to update");
	    		String name=sc.next();
	    		String namechange=atm.name;
	    		atm.setname(name);
	    		System.out.println("Name Updated Successfully from "+namechange+" to "+name);
	    		break;
	    	case 5:
	    		System.out.println("Printing Your current Details");
	    		System.out.println(atm.toString());
	    		break;
	    	}
	    }
	}

}
