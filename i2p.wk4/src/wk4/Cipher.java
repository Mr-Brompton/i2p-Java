package wk4;

public class Cipher {

	public static String encodeCeaser(String input) {
		
		// TODO Amend program so it encodes the unpunctuated text (input) using Caesar’s cipher, 
		//e.g, A becomes D, B becomes E, ... Z becomes C. and output the resulting encoded text
		char currentChar = ' ';
		char codedChar = ' ';
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int inputLength = input.length();
		int alphaLength = alphabet.length;
		StringBuilder codedText = new StringBuilder();
		
		for(int i = 0; i<inputLength; i++) {
			currentChar = input.charAt(i);
			for (int x = 0; x < alphaLength; x++) {
				if (currentChar == alphabet[x]) {
					codedChar=alphabet[x+3];
					codedText.append(codedChar);
				}
				}
			}
		return codedText.toString();	
	}
		
		
		
		
}


