import java.util.Scanner;

public class MoveAllXToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        xmapping(name,0);
    }

    public static void xmapping(String name,int len){
        if(len == name.length() )
        {
            return; 
        }

        if(name.charAt(len) != 'x'){
            System.out.print(name.charAt(len));
        }

        xmapping(name, len+1);

        if(name.charAt(len) == 'x'){
            System.out.print(name.charAt(len));
        }
    } 
}
