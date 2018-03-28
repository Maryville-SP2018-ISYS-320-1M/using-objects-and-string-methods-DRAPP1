/*
	ISYS 320
	Name(s): Dave Rapp
	Date: 3-26-18
*/

public class P4_Vertical {

	public static void main(String[] args) {

		vertical("HEY NOW");
	}
	
	public static void vertical(String str) {
		
		
		for (int i=0; i< str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
