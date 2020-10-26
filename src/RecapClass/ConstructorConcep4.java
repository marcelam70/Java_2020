package RecapClass;

import java.lang.reflect.Constructor;

public class ConstructorConcep4 {
	
	//public variable
	int modelYear;
	String modelName;
	public ConstructorConcep4(int modelYear, String modelName){
		this.modelYear = modelYear;
		this.modelName = modelName;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ConstructorConcep4 cc = new ConstructorConcep4(2019,"Kona");
   System.out.println(cc.modelYear + " " + cc.modelName) ;
	}

}
