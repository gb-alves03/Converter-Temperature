package tempConverter;

import java.util.Scanner;

public class Rankine extends Temperature{
	
	Scanner input = new Scanner(System.in);
	
	public Rankine(double temperature) {
		super(temperature);
	}
	
	@Override
	public void insertTemperature() {
		System.out.println("Insert the temperature in Rankine to convert");
		this.temperature = input.nextDouble();
	}

}
