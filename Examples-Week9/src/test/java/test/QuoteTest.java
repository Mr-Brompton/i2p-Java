package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

import examples.statemachine.stage8.QuoteFinder;

public class QuoteTest {
	@Test
	void testEmpty() throws IOException {
		Reader reader = new StringReader("");
		QuoteFinder finder = new QuoteFinder(reader);
		assertNull(finder.nextQuote());
	}
	
	@Test
	void testNotAQuote() throws IOException {
		Reader reader = new StringReader("hello");
		QuoteFinder finder = new QuoteFinder(reader);
		assertNull(finder.nextQuote());
	}

	@Test
	void testWithAQuote() throws IOException {
		Reader reader = new StringReader("a \"real\" test");
		QuoteFinder finder = new QuoteFinder(reader);
		assertEquals("real", finder.nextQuote());
		assertNull(finder.nextQuote());
	}

	@Test
	void testMultipleQuotes() throws IOException {
		Reader reader = new StringReader("a \"quote\" followed by \"another\" one");
		QuoteFinder finder = new QuoteFinder(reader);
		assertEquals("quote", finder.nextQuote());
		assertEquals("another", finder.nextQuote());
		assertNull(finder.nextQuote());
	}

	@Test
	void testStartWithQuote() throws IOException {
		Reader reader = new StringReader("\"start\" with a quote");
		QuoteFinder finder = new QuoteFinder(reader);
		assertEquals("start", finder.nextQuote());
		assertNull(finder.nextQuote());
	}

	@Test
	void testQuoteAtEnd() throws IOException {
		Reader reader = new StringReader("quote at \"end\"");
		QuoteFinder finder = new QuoteFinder(reader);
		assertEquals("end", finder.nextQuote());
		assertNull(finder.nextQuote());
	}

	@Test
	void testEscapedQuote() throws IOException {
		Reader reader = new StringReader("text with \\\" escaped \"quote\"");
		QuoteFinder finder = new QuoteFinder(reader);
		assertEquals("quote", finder.nextQuote());
		assertNull(finder.nextQuote());
	}

}
