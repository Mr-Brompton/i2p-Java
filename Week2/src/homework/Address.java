package homework;
/**
 * Address builds a formatted name to use as an address name.
 * format:
 * 	[First Initial], [Second Initial], [Surname].
 * fullName should return a sensibly formatted full name for including on an envelope.
 *
 * @author MrBro
 * @title Address
 */
// TODO handle titles, mr, mrs, miss etc 
public class Address {
	
	private char firstInitial;
	private char secondInitial;
	private String surName;
	String printableName;
	
	/** Address Constructor
	 * Builds a name formatted for use on envlope
	 * @param title
	 * @param firstName
	 * @param secondName
	 * @param surName
	 */
	public Address(String firstName, String secondName, String surName) {
		this.firstInitial = firstName.toUpperCase().charAt(0);
		this.secondInitial = secondName.toUpperCase().charAt(0);
		this.surName = capitalizeFirstLetter(surName);
		this.printableName = BuildAddressName();
	}
	
	/**
	 * Capitalizes the first letter of a word. In this case, surName2, which is named so to avoid programmer confusion.
	 * @param surName2
	 * @return The input word, with a starting capital letter.
	 */
	private String capitalizeFirstLetter(String surName2) {
		char lastInit = surName2.charAt(0);
		String nonCapLastInit = " " + lastInit;
		String CapLastInit = nonCapLastInit.toUpperCase();
		char[] chars = new char[surName2.length()];
		for (int i = 0; i < surName2.length(); i++) {
			if (i == 0) {}
			if (i > 0) {
				chars[i] = surName2.charAt(i);
			}
		};
		String surNameTrail = "";
		for (int x = 1; x < chars.length; x++) {surNameTrail = surNameTrail + chars[x];}
		String capSurName = CapLastInit + surNameTrail;
		return capSurName;
	}

	/**Build Address Name
	 * This concatenates the formatted name.
	 * @return
	 */
	
	/*
	 * Doesn't use String Builder as in this use case there is no need.
	 */
	private String BuildAddressName() {
		return firstInitial + ", " + secondInitial + ", " + surName + ",";
	}
	/**
	 * First, builds address object, then accesses the fullname field.
	 * @param forename
	 * @param middleName
	 * @param surName
	 * @return full name formatted for envolope.
	 */
	public String fullName(String forename, String middleName, String surName) {
		Address fullName = new Address(forename, middleName, surName); 
		return fullName.printableName;
		}

}