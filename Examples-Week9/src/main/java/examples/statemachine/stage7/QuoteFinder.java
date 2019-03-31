package examples.statemachine.stage7;

import java.io.IOException;
import java.io.Reader;

public class QuoteFinder {
	private Reader reader;
	
	public QuoteFinder(Reader reader) {
		this.reader = reader;
		this.token = new StringBuilder();
	}

	enum State { OUTSIDE, IN_QUOTE, ESC_OUT, ESC_IN };
	
	private State state = State.OUTSIDE;
	private StringBuilder token;

	public String nextQuote() throws IOException {
		for (int c = reader.read(); c != -1; c = reader.read()) {
			switch (state) {
			case OUTSIDE:
				if (c == '\\') {
					state = State.ESC_OUT;
				} else if (c == '"') {
					state = State.IN_QUOTE;
				}
				break;
			case IN_QUOTE:
				if (c == '\\') {
					state = State.ESC_IN;
				} else if (c == '"') {
					state = State.OUTSIDE;
					String ret = token.toString();
					token.setLength(0);
					return ret;
				} else {
					token.append((char)c);
				}
				break;
			case ESC_OUT:
				state = State.OUTSIDE;
				break;
			case ESC_IN:
				token.append((char)c);
				state = State.IN_QUOTE;
				break;
			}
		}
		return null;
	}
}
