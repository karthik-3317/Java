package generic;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Linked {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<LinkedDemo> po=new LinkedList<LinkedDemo>();
		LinkedDemo l1=new LinkedDemo(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
		LinkedDemo l2=new LinkedDemo(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
		po.add(l1);
		po.add(l2);
		Collections.sort(po);
		for(LinkedDemo ld:po)
		System.out.println(ld);
		System.out.println("there is nothing to worry");
	}
}
