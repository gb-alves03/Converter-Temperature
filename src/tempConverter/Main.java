package tempConverter;


public class Main {
	public static void main(String[] args) {
		
		Celsius celsius = new Celsius();
		celsius.insertTemperature();
		
		Fahrenheit fahrenheit = new Fahrenheit();
		fahrenheit.insertTemperature();
		
		Rankine rankine = new Rankine();
		rankine.insertTemperature();
		
		Kelvin kelvin = new Kelvin();
		kelvin.insertTemperature();
		
		Converter converter = new Converter();
		converter.setCelsius(celsius);
		converter.setFahrenheit(fahrenheit);
		converter.setKelvin(kelvin);
		converter.setRankine(rankine);
		
		converter.celsiusToFahrenheit();
		converter.celsiusToKelvin();
		converter.celsiusToRankine();
		converter.fahrenheitToCelsius();
		converter.fahrenheitToKelvin();
		converter.fahrenheitToRankine();
		converter.kelvinToCelsius();
		converter.kelvinToFahrenheit();
		converter.kelvinToRankine();
		converter.rankineToCelsius();
		converter.rankineToFahrenheit();
		converter.rankineToKelvin();
	}
}
