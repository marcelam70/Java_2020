package TOPICS_6;

public class BarnesNoble extends BOOKSTORE {
	
	
	public BarnesNoble (String storeName, int numOfBook){
		super(storeName, numOfBook);
		
	}
	@Override
	 public void workHours(String start, String closing) {
		   System.out.println("Sstart time :" + start + "\nFinish time:" + closing);
}
	@Override
	 public int numOfEmployee(int numOfEmployee){
			return numOfEmployee;
	 }
}