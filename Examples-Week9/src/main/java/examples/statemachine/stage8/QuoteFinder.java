package examples.statemachine.stage8;

import java.io.IOException;
import java.io.Reader;

public class QuoteFinder {
	private Reader reader;
	private StringBuilder token;
	
	public QuoteFinder(Reader reader) {
		this.reader = reader;
		this.token = new StringBuilder();
	}

	enum State { OUTSIDE, IN_QUOTE, ESC_OUT, ESC_IN };
	private State state = State.OUTSIDE;

	public String nextQuote() throws IOException {
		for (int i = reader.read(); i != -1; i = reader.read()) {
			char c = (char)i;
			
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
					return finalToken();
				} else {
					token.append(c);
				}
				break;
				
			case ESC_OUT:
				state = State.OUTSIDE;
				break;
				
			case ESC_IN:
				token.append(c);
				state = State.IN_QUOTE;
				break;
				
			}
		}
		
		return null;
	}
	
	private String finalToken() {
		String ret = token.toString();
		token.setLength(0);
		return ret;
	}
}
