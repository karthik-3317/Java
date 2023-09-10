package postlab;

public class postlab2 {
	public static void main(String[] args){

    }

    public boolean StringBuff(StringBuffer sbOne, StringBuffer sbTwo){
        sbTwo = sbOne;
        if(sbTwo==sbOne){
            return true;
        }

        else{
            return false;
        }
    }
}
