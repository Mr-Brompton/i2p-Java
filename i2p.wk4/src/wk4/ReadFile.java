package wk4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
 * A collection of methods to extract data from files
 */
public class ReadFile {
	/**
	 * Reads file and returns as string using readAllBytes
	 */
	
	public static String asString(String fileName) {
		String fileAsString = null;
		Path pathToFile = Paths.get(fileName);
		//used for testing
		//System.out.println(pathToFile.toAbsolutePath());
		try {
			fileAsString = new String(Files.readAllBytes(pathToFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileAsString;	
	}
	
}
