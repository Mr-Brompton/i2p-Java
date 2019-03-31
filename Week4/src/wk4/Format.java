package wk4;

public class Format {

	public static String BlocksOfFiveCaps(String encodedSherlock) {
		StringBuilder formattedSherlock = new StringBuilder();
		String upperSherlock = encodedSherlock.toUpperCase();
		int upperIndex = 0;	
		do {
			for (int i = 0; i < 5; i++) {
			formattedSherlock.append(upperSherlock.charAt(upperIndex));
			upperIndex++;
			}
			formattedSherlock.append(' ');
			} while (upperIndex < upperSherlock.length());
		
		
		return formattedSherlock.toString();
		
	}

}
