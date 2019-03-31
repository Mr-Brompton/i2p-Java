package examples.statemachine.stage5;

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
			if (state == ESC_OUT) {
				state = OUTSIDE;
				continue;
			}
			if (state == ESC_IN) {
				token.append((char)c);
				state = IN_QUOTE;
				continue;
			}
			if (c == '\\') {
				if (state == OUTSIDE) {
					state = ESC_OUT;
				} else {
					state = ESC_IN;
				}				
			} else 	if (c == '"') {
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
