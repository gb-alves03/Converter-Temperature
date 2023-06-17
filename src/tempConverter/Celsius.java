package tempConverter;

import java.util.Scanner;

public class Celsius extends Temperature{
	
	Scanner input = new Scanner(System.in);
	
	public Celsius(double temperature) {
		super(temperature);
	}
	
	@Override
	public void insertTemperature() {
		System.out.println("Insert the temperature in Celsius to convert: ");
		this.temperature = input.nextDouble();
	}
}
