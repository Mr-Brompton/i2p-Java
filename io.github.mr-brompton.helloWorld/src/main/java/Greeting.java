package main.java;

public class Greeting {
	private String opening;
	private String noun;
	public String sayHi;


	public Greeting(String opening, String noun) {
		this.opening = opening;
		this.noun = noun;
		String sayHi = this.opening + " " + this.noun + ".";
		this.sayHi = sayHi;
	}
}

