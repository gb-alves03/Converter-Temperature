package tempConverter;


public class Main {
	public static void main(String[] args) {
		Celsius celsius = new Celsius();
		celsius.insertTemperature();
		
		Fahrenheit fahrenheit = new Fahrenheit();
		fahrenheit.insertTemperature();
		
		Kelvin kelvin = new Kelvin();
		kelvin.insertTemperature();
		
		//System.out.println("A temperatura é: " + celsius.getTemperature());
		Converter converter = new Converter();
		converter.setCelsius(celsius);
		converter.setFahrenheit(fahrenheit);
		converter.setKelvin(kelvin);
		
		converter.celsiusToFahrenheit();
		converter.celsiusToKelvin();
		converter.fahrenheitToCelsius();
		converter.fahrenheitToKelvin();
		converter.kelvinToCelsius();
		converter.kelvinToFahrenheit();
	}
}
