package RecapClass2;

public class Library {

	public static void main(String[] args) {
		//create object
		Book  book1 = new Book();
		book1.setAuthor("Angela");
	    book1.setTitle("Grit");
	    book1.setPage(400);
	    System.out.println("Book name:" + book1.getTitle());
	    System.out.println("Book writer:" + book1.getAuthor());
	    System.out.println("Book pages:" + book1.getPage());
	

	}

}
