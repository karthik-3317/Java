package inlab;

public class inlab3 {
	  public boolean isValid(String Password) {
	    if(Password.length()>=5&&Password.length()<=10) {
	      return true;
	    }
	    else
	      return false;
	  }

	}