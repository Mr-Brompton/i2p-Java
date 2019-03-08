package homework;

public class Address {  
	public static String fullName(String forename, String middleName, String surName) {
		String eName = null;
		
		
		
		char firstInitial = forename.charAt(0);
		//Concatenated here instead of return as char can't be uppercased
		String firstInitString = firstInitial + " ";
		char secondInitial = middleName.charAt(0);
		String secondInitString = secondInitial + "";
		char lastInit = surName.charAt(0);
		String nonCapLastInit = " " + lastInit;
		String CapLastInit = nonCapLastInit.toUpperCase();
		char[] chars = new char[surName.length()];
		for (int i = 0; i < surName.length(); i++) {
			if (i == 0) {}
			if (i > 0) {
				chars[i] = surName.charAt(i);
			}
		};
		String surNameTrail = "";
		for (int x = 1; x < chars.length; x++) {surNameTrail = surNameTrail + chars[x];}
		String capSurName = CapLastInit + surNameTrail;
		eName = firstInitString.toUpperCase() + secondInitString.toUpperCase() + capSurName + ",";
		return eName; 
		
	}
}