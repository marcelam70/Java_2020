package SmallGroup;

public class Wednesday18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr ={1,2,3,4,5,6,7,8};
 int countEven = 0;
 int countOdd =0;
 for (int i= 0; i <arr.length; i++) {
	 if (i%2==0) {
		 countEven++;
		
	}else if (i%2==1){
		countOdd++;
	
}
		
}
 System.out.println("The number of even =" + countEven);
 System.out.println("The number of odd =" + countOdd);
	}

}
