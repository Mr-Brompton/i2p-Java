package examples.statemachine.stage4;

import java.io.IOException;
import java.io.Reader;

public class QuoteFinder {
	private Reader reader;
	
	public QuoteFinder(Reader reader) {
		this.reader = reader;
		this.token = new StringBuilder();
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
					String ret = token.toString();
					token.setLength(0);
					return ret;
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
