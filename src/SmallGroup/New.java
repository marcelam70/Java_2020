package SmallGroup;

public class New {

	public static void main(String[] args) {
	
	
	int avar = 0;
	if (avar++ < 10) {
		System.out.println(avar + "Hello World!");
		
	}else{
		System.out.println(avar + "Hello Universe!");
	}
	String ta= "A";
	ta= ta.concat("B");
		String tb = "C";
		ta = ta.concat(tb);
		ta.replace("C", "D");
		ta = ta.concat(tb);
		System.out.println(ta);
}
	}


