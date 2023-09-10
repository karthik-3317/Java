package aditya;
import java.util.Scanner;
public class LibraryDemo 
{
	Scanner sc=new Scanner(System.in);
	Library l[]=new Library[100];
	int size=0;
	boolean loop=true;
	int i,choice;
	System.out.println("ENTER YOUR CHOICE\n");
	System.out.println("1.create\n 2.sort by name \n3.sortbyauthorname\n 4.sort by years of realse \n5.search by isbn\n6.update author name by isbn\n others exit");
	choice=sc.nextInt();
     	switch(sc.nextInt()) {
     	case 1:
     		System.out.println("Enter create sortbyname sortby author name sort by years ofrealse search by isbn update  );
     		s[size++]=new Student(sc.nextLong(),sc.next(),sc.next(),sc.nextInt(),
     				sc.nextFloat());
     		break;
     	case 2:
     		for(i=0;i<size;i++)
     			System.out.println(s[i]);
     		break;
     	case 3:
     		Student.sortById(s, size);
     		break;
     	case 4:
     		Student.sortByName(s, size);
     		break;
     	case 5:
     		System.out.println("Entetr search id");
     		if(Student.searchById(s,size,sc.nextLong()))
     			System.out.println("Data found");
     		else
     			System.out.println("Data not found");
     		break;
     	case 6:
     		System.out.println("Enter search name");
     		if(Student.searchByName(s, size,sc.next()))
     			System.out.println("Name found");
     		else
     			System.out.println("Name not found");
     		break;
     	case 7:
     		System.out.println("Enter id and newName");
     		if(Student.updateNameById(s, size,sc.nextLong(),sc.next()))
     			System.out.println("Updated Successfully");
     		else
     			System.out.println("Id not found");
     		break;	
     	default:
     		loop=false;
     	}
     }
		sc.close();
	}

}
