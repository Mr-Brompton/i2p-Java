package examples.statemachine.stage1;

import java.io.IOException;
import java.io.Reader;

public class QuoteFinder {
	private Reader reader;
	
	public QuoteFinder(Reader reader) {
		this.reader = reader;
	}

	public String nextQuote() throws IOException {
		return null;
	}
}
