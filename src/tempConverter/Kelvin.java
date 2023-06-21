package tempConverter;

import java.util.Scanner;

public class Kelvin extends Temperature{

	Scanner input = new Scanner(System.in);
	
	public Kelvin(double temperature) {
		super(temperature);
	}
	
	@Override
	public void insertTemperature() {
		System.out.println("Insert the temperature in Kelvin to convert: ");
		this.temperature = input.nextDouble();
	}
}
