import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        subSequence(name, 0, "");
    }

    public static void subSequence(String name, int idx, String newString)
    {
        if(idx == name.length())
        {
            System.out.println(newString);
            return;
        }
        char currCharacter = name.charAt(idx);

        //to be 
        subSequence(name, idx + 1, newString + currCharacter);
        
        //or not to be
        subSequence(name, idx + 1, newString);
    }
}
