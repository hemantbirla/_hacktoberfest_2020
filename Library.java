package assignment4;
abstract class Book
{
	String author;
	String publication;
	int noofpages;
	int price;
	Book(String a,String b,int c,int d)
	{
		author=a;
		publication=b;
		noofpages=c;
		price=d;
	}
	abstract void displayBookInfo();	
}
final class TextBook extends Book
{
	String subject;
	TextBook(String f,String g,int h,int i,String e)
	{
		super(f,g,h,i);
		subject=e;
	}
	final void displayBookInfo()
	{
		System.out.println("author: "+author);
		System.out.println("publication: "+publication);
		System.out.println("noofpages: "+noofpages);
		System.out.println("price: "+price);
		System.out.println("subject: "+subject);
	}
}
class StoryBook extends Book
{
	int recommendAge;
	boolean IsAnimated;
	StoryBook(String j,String k,int l,int m,int n,boolean o)
	{
		super(j,k,l,m);
		recommendAge=n;
		IsAnimated=o;
	}
	void displayBookInfo()
	{
		System.out.println("author: "+author);
		System.out.println("publication: "+publication);
		System.out.println("noofpages: "+noofpages);
		System.out.println("price: "+price);
		System.out.println("recommenAge: "+recommendAge);
		System.out.println("IsAnimated: "+IsAnimated);
	}
}
public class Library {
	public static void main(String[] args) {
		System.out.println("Story book info");
		StoryBook S=new StoryBook("an story of old man","joys",8,150,30,true);
		 S.displayBookInfo();
		System.out.println("Text book info");
		TextBook T=new TextBook("a complete java","arihant",5,250,"java");
		 T.displayBookInfo();
		System.out.println("Book info");
	
	}

}

