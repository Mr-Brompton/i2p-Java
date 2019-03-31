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

	public static String decodeCeaser(String encodedSherlock) {
		char currentChar = ' ';
		char codedChar = ' ';
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int inputLength = encodedSherlock.length();
		int alphaLength = alphabet.length;
		StringBuilder decodedText = new StringBuilder();
		
		//Go Through the input (encoded Sherlock) char by char
		for(int i = 0; i<inputLength; i++) {
			//look at the current character
			currentChar = encodedSherlock.charAt(i);
			//go through each letter of the alphabet
			for (int x = 0; x < alphaLength; x++) {
				//and check if it is the same as the current char
				if (currentChar == alphabet[x]) {
					//if so, save alphabet letter three indexes lower as coded cipher char
					codedChar=alphabet[x-3];
					//append char to decoded string
					decodedText.append(codedChar);
				}
				}
			}
		return decodedText.toString();	
	}
		
		
		
		
}


