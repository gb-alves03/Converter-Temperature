package tempConverter;

import java.util.Scanner;

public class Fahrenheit extends Temperature{
	
	Scanner input = new Scanner(System.in);
	
	public Fahrenheit(double temperature) {
		super(temperature);
	}
	
	@Override
	public void insertTemperature() {
		System.out.println("Insert the temperature in Fahrenheit to convert: ");
		this.temperature = input.nextDouble();
	}
}
