package BasicJavaPrac;

import org.testng.asserts.Assertion;

public class ArrayList {

	public static void main(String[] args) {
		
	java.util.ArrayList<String> obj = new java.util.ArrayList<String>();
	obj.add("ankur");
	obj.add("sapna");
	obj.add("gudiya");
	
	//System.out.println(obj.size());
	
	for (String a : obj) {
		System.out.println(a);
	}
	
	
}
}