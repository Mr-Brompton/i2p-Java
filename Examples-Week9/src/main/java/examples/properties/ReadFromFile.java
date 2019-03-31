package examples.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		File f = new File("saved.props");
		if (f.exists() && f.canRead()) {
			InputStream in = null;
			try {
				in = new FileInputStream(f);
				p.load(in);
			} finally {
				if (null != in) in.close();
			}
		}
		
		for (Object key : p.keySet()) {
			System.out.println("got key '" + key + "' with value " + p.get(key));
		}
	}

}
