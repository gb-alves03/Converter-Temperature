package tempConverter;
import java.util.Scanner;

public class Celsius {
	private double temperature;
	
	Scanner input = new Scanner(System.in);
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getTemperature() {
		return temperature;
	}
	
	public void insertTemperature() {
		System.out.println("Insert the temperature in Celsius to convert: ");
		this.temperature = input.nextDouble();
	}
}
