package examples.statemachine.stage6;

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
	public static final int ESC_OUT = 2;
	public static final int ESC_IN = 3;
	
	private int state = OUTSIDE;
	private StringBuilder token;

	public String nextQuote() throws IOException {
		for (int c = reader.read(); c != -1; c = reader.read()) {
			switch (state) {
			case OUTSIDE:
				if (c == '\\') {
					state = ESC_OUT;
				} else if (c == '"') {
					state = IN_QUOTE;
				}
				break;
			case IN_QUOTE:
				if (c == '\\') {
					state = ESC_IN;
				} else if (c == '"') {
					state = OUTSIDE;
					String ret = token.toString();
					token.setLength(0);
					return ret;
				} else {
					token.append((char)c);
				}
				break;
			case ESC_OUT:
				state = OUTSIDE;
				break;
			case ESC_IN:
				token.append((char)c);
				state = IN_QUOTE;
				break;
			}
		}
		return null;
	}
}
