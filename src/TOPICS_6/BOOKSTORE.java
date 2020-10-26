package TOPICS_6;

public class BOOKSTORE {// parent class super class base clase
   private String storeName;
   private int numOfBook;
   
   public BOOKSTORE(String storeName, int numOfBookName){
	   super();
	   this.storeName = storeName;
	   this.numOfBook = numOfBookName;
	   System.out.println("Store name :" + storeName + "\nBook Numbers:" +numOfBookName);
			   
	   
   }
   public void workHours(String start, String closing) {
	   System.out.println("Sstart time :" + start + "\nFinish time:" + closing);
	
}
   public int numOfEmployee(int numOfEmployee){
	return numOfEmployee;
	   
   }
}
