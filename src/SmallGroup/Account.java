package SmallGroup;

public class Account {

	private String id;
	private String name;
	private int balance =0;
	
	public Account(String id, String name) {
	
		this.id = id;
		this.name = name;
	
	}
	public Account(String id,String name,int balance){
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		balance = 500;
		return balance;
	}
	public int Credit(int amount){
		return balance += amount;
	}
	public int Debit(int amount){
		if (amount <= balance){
			balance -= amount;
			return balance;
		}
		else{
			System.out.println("Amount exceeded:!");
		}
		return balance;
	}
	public int transferTo(Account another, int amount){
		if(amount<=balance){
			another.balance = another.balance + amount;
			this.balance -= amount;
			return balance;	
		}else{
			System.out.println("Amount exceeded:!");
		}
return balance;	
	}
	public String toString(){
		return "Account[id= 45543, name= Marcela, balance=50";
	
	}
	public static void main(String[] args) {
	 
	Account account = new Account("2345", "Marcela", 0);
	Account another = new Account("4321", "Dylan", 200);
	account.transferTo(another, 500);
	System.out.println(account.toString());
	System.out.println("Balance:" + account.getBalance() );
	System.out.println("Debit:" + account.Debit(100));
	System.out.println("Credit:" + account.Credit(5000));
	
	System.out.println("Transfer to another account:" +( another.balance));
	
	{	
}		
{		
}
	
	}
}
