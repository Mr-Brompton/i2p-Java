package wk4;
/**
 * 
 * @author MrBro
 *A collection of methods to remove stuff from strings
 */

public class RemoveFromString {
/**
 * removes punctiation and numbers for this particular task.
 * The code is ugly.
 * The solution is brutish.
 * I can do better.
 * But it gets me to the next step ASAP.
 * @param sherlockStart
 * @return
 */
	public static String punctuation(String sherlockStart) {
		// TODO create a method to remove punctuation from string
		char[] sherlockLetters = new char[sherlockStart.length()];
		char currentChar;
		int hits = 0;
		for (int i = 0; i < sherlockStart.length(); i++) {
			currentChar = sherlockStart.charAt(i);
			//Switch is not the best way to do this, however it makes adding cases easier.
			//Needs refactoring.
			switch (currentChar) {
			case '-':
				
			break;
			case ',':
				
			break;
			case ' ':
				
			break;
			case '1':
				
			break;
			case '8':
				
			break;
			case '(':
			break;
			case ')':
			break;
			case '.':
				break;
			case ':':
				break;
			case '\'':
				break;	
			default:
				sherlockLetters[hits] = currentChar; 
				hits++;
			}
			}
		StringBuilder sherlockLetString = new StringBuilder();
		for (int i = 0; i < sherlockLetters.length; i++ ) {

			sherlockLetString.append(sherlockLetters[i]);			
		}
		
		String output = sherlockLetString.toString();
		//used for testing
		//System.out.println(output);
		return output ;
		
	}

}
