package i2p.wk1.DanteRobot;

public class VolcanoRobot {    
	String status;    
	int speed;    
	float temperature;    
	void checkTemperature() {        
		if (temperature > 660) {
			status = "returning home";
			speed = 5;
			}    
		}    
	void showAttributes() {        
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.println("Temperature: " + temperature);
		}
	}