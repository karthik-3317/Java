package aditya;

public class Library {
	private String bookname,authorname,publication;
	private long isbn;
	private int yearsofrealse;
	Library( String bookname,String authorname,long isbn,String publication,int yearsofrealse)
	{
		this.bookname=bookname;
		this.authorname=authorname;
		this.isbn=isbn;
		this.publication=publication;
		this.yearsofrealse=yearsofrealse;
		}
	public String toString()
	{
		return "bookname="+bookname+"authorname="+authorname+"isbn="+isbn+"publication="+publication+"yearsofrealse="+yearsofrealse;
	}
	 static void sortbybookname(long library[],int size)
	{
		
	}
	static void sortbyauthorname(long library[],int size)
	{
		
	}
	static void sortbyyearsofrealse(long library[],int size)
	{
		
	}
	static boolean searchbyisbn(long library[],int size,long isbn)
	{
		return false;
	}
	static boolean updateauthornamebyisbn(long library[],int size,long isbn,string authorname)
	{
		return false;
	}
}
