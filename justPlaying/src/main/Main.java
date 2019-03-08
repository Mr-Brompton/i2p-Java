package main;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) { 
	String sn = null;
		InetAddress ip;
		try {
				
			ip = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ip.getHostAddress());
			
			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
				
			byte[] mac = network.getHardwareAddress();
				
			System.out.print("Current MAC address : ");
				
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
			}
			System.out.println(sb.toString());
				
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
			
		} catch (SocketException e){
				
			e.printStackTrace();
				
		}
	
	if (sn != null) {
		System.out.println(sn);
	}

	OutputStream os = null;
	InputStream is = null;

	Runtime runtime = Runtime.getRuntime();
	Process process = null;
	try {
		process = runtime.exec(new String[] { "wmic", "bios", "get", "serialnumber" });
	} catch (IOException e1) {
		throw new RuntimeException(e1);
	}

	os = process.getOutputStream();
	is = process.getInputStream();

	try {
		os.close();
	} catch (IOException e) {
		throw new RuntimeException(e);
	}

	@SuppressWarnings("resource")
	Scanner sc = new Scanner(is);
	try {
		while (sc.hasNext()) {
			String next = sc.next();
			if ("SerialNumber".equals(next)) {
				sn = sc.next().trim();
				break;
			}
		}
	} finally {
		try {
			is.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	if (sn == null) {
		throw new RuntimeException("Cannot find computer SN");
	}

	System.out.println("Serial: " + sn);
}
}
