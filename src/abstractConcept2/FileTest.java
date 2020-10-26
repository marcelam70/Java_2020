package abstractConcept2;

public class FileTest {

	public static void main(String[] args) {
		//File file1 = new File();
		XLSFile xl = new XLSFile();
		xl.close();
		xl.open();
		xl.setName("TestData.xls");
		System.out.println("XLS file name:" + xl.getName());
		System.out.println(File.count);
		System.out.println(XLSFile.count);
		
		JPGFile jpgFile = new JPGFile();
		jpgFile.close();
		jpgFile.open();
		jpgFile.setName("graduation.jpg");
		System.out.println("JPG file name:" + jpgFile.getName());
		System.out.println(File.count);
		System.out.println(jpgFile.count);
		
		PDFFile pdfFile = new PDFFile("Selenium.pdf");
		pdfFile.close();
		pdfFile.open();
		System.out.println(File.count);
		System.out.println(PDFFile.count);
		
	}

}
