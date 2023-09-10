package generic;
import java.util.Vector;
import java.util.*;
public class VvectorDemo {
	public static void main(String [] args)
	{
		Vector<Vvector> t=new Vector<>();
		Scanner sc=new Scanner(System.in);
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.add\n 2.display \n 3.sort by name");
		  switch(sc.nextInt())
		  {
		  case 1:
			  System.out.println("add,name,id,mark,cgpa");
			  String addre=sc.nextLine();
			  sc.nextLine();
			  String name=sc.next();
			  int id=sc.nextInt();
			  int mark=sc.nextInt();
			  float cgpa=sc.nextFloat();
			  t.add(new Vvector(id,name,addre,mark,cgpa));
			  break;
		  case 2:
			  for(Vvector v:t)
			  {
				  System.out.println(v);
			  }
			  break;
		  case 3:
			  Collections.sort(t);
			  break;
		  default :
			  loop=false;
		  }
		  
		}
	}
}
