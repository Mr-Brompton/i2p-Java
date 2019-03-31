package examples.statemachine.stage2;

import java.io.IOException;
import java.io.Reader;

public class QuoteFinder {
	private Reader reader;
	
	public QuoteFinder(Reader reader) {
		this.reader = reader;
	}

	public static final int OUTSIDE = 0;
	public static final int IN_QUOTE = 1;
	
	private int state = OUTSIDE;
	private StringBuilder token;

	public String nextQuote() throws IOException {
		for (int c = reader.read(); c != -1; c = reader.read()) { 
			if (c == '"') {
				if (state == OUTSIDE) {
					state = IN_QUOTE;
				} else {
					state = OUTSIDE;
				}
			} else {
				if (state == IN_QUOTE) {
					token.append((char)c);
				}
			}
		}
		return null;
	}
}
