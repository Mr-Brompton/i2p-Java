package examples.properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		p.put("name", "Clarence Sayle");
		p.put("age", "65");
		p.put("height", "1.82");
		
		File f = new File("saved.props");
		OutputStream out = null;
		try {
			out = new FileOutputStream(f);
			p.store(out, "saved props example");
		} finally {
			if (null != out) {
				out.flush();
				out.close();
			}
		}
		System.out.println("props saved OK");
	}

}
