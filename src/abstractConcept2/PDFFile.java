package abstractConcept2;

public class PDFFile extends File {
     //How can I call File(String name)
	//supe()
	 public PDFFile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void open() {
		System.out.println("PDF file using Adibe Acrobat Reader");
		
	}

}
