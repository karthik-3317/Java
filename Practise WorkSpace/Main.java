import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String unique = sc.nextLine();
        Set<Character>  st = new HashSet<>();
        Set<Character>  lst = new LinkedHashSet<>();
        char [] charr = unique.toCharArray();

        for(char ch:charr){
            if(st.add(ch)){
                lst.add(ch);
            }
            else{
                lst.remove(ch);
            }
        }
        for(char ch:lst){
            System.out.println(ch);
            break;
        }
        Iterator<Character> it = st.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

