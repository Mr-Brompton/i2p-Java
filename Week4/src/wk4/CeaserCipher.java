package wk4;

public class CeaserCipher {

	public static void main(String[] args) {
		/*- Go to http://sherlock-holmes.classic-literature.co.uk/a-scandal-in-bohemia/
		 *- Copy a paragraph of text from a page of this story and save it in a local file
		 *- Write a short program that reads your saved paragraph from the file
		 *- displays it on the console.
		 *- Hint: Google for “java read a file into a string”
		 *
		 * - Amend your program so it removes all punctuation from text including 
		 * -	spaces, 
		 * -	commas, 
		 * -	full stops, etc. 
		 * 
		 * -Output the resulting paragraph.
		 * -Hint: You will probably need a loop (See week 2) and a StringBuilder for this.
		 * 
		 * -Save some different paragraphs from the same story to their own files 
		 * -run your program using each in turn. 
		 * 
		 * -Amend program so it encodes the unpunctuated text using Caesar’s cipher, 
		 * -e.g, A becomes D, B becomes E, ... Z becomes C. and output the resulting encoded text
		 * 
		 * -Refactor your Task 3 program so that the encoding of text is done in a sensibly-named method 
		 * -which is called by your “main”. 
		 * 
		 * -Add an extra method which decodes encrypted text back to its original characters. 
		 * -Are there any problems with this? Read about “Lossy Compression” ( e.g. https://en.wikipedia.org/wiki/Lossy_compression )
		 * 
		 * -Amend program so it presents the encoded text (ciphertext) as blocks of five characters separated by a single space 
		 * -with all characters in uppercase, e.g.WHAWO LNHWK LVXXX
		 * 
		 * If there is insufficient text for the final block, terminate it with sufficient X’s to have a 5-character block.
		 * 
		 * Update your decode method so that it copes correctly with these additional space and X characters. 
		 * 
		 * Write JUnit tests to prove that it works.
		*/
		
		//filePath and fileName separated to make filechanges easier.
		String filePath = "C:\\Users\\MrBro\\OneDrive\\Documents\\Uni\\Introduction to programming\\eclipse\\workspace\\Week4\\src\\data\\";
		String fileName = "sherlock2.txt";
		String sherlockStart = ReadFile.asString(filePath + fileName);
		String noShitSherlock = RemoveFromString.punctuation(sherlockStart);
		String encodedSherlock = Cipher.encodeCeaser(noShitSherlock);
		System.out.println(encodedSherlock);
		String decodedSherlock = Cipher.decodeCeaser(encodedSherlock);
		System.out.println(decodedSherlock);
		String formattedSherlock = Format.BlocksOfFiveCaps(encodedSherlock);
		System.out.println(formattedSherlock);
	}
	}
