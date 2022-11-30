package Oops1;

public class UseLibrary {

	public static void main(String[] args) {
	Book book=new Book();
	book.name="harry potter";
	book.authorName="harry";
	
	Library library=new Library();
	library.libraryType="public";
	library.location="tambaram";
	library.book=book;
	
	System.out.println(library.libraryType+(",")+library.book.name);

	}

}
