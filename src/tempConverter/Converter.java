package tempConverter;

public class Converter {
	private Celsius celsius;
	private Fahrenheit fahrenheit;
	private Kelvin kelvin;
	
	public void setCelsius(Celsius celsius) {
		this.celsius = celsius;
	}
	public Celsius getCelsius() {
		return celsius;
	}
	
	public void setFahrenheit(Fahrenheit fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	public Fahrenheit getFahrenheit(){
		return fahrenheit;
	}
	
	public void setKelvin(Kelvin kelvin) {
		this.kelvin = kelvin;
	}
	public Kelvin getKelvin() {
		return kelvin;
	}
	
	public void celsiusToFahrenheit() {
		double fahrenheit = (celsius.getTemperature() * 1.8) + 32;
		System.out.println(celsius.getTemperature() + " C degrees in F = " + fahrenheit);
	}
	
	public void fahrenheitToCelsius() {
		double celsius = (fahrenheit.getTemperature() - 32) * 0.5556;
		System.out.println(fahrenheit.getTemperature() + " F degrees in C = " + celsius);
	}
	
	public void celsiusToKelvin() {
		double kelvin = (celsius.getTemperature() + 273.15);
		System.out.println(celsius.getTemperature() + " C degrees in K = " + kelvin);
	}
	
	public void kelvinToCelsius() {
		double celsius = (kelvin.getTemperature() - 273.15);
		System.out.println(kelvin.getTemperature() + " K degrees in C = " + celsius);
	}
	
	public void kelvinToFahrenheit(){
		double fahrenheit = ((kelvin.getTemperature() - 273.15) * 1.8) + 32;
		System.out.println(kelvin.getTemperature() + " K degrees in F = " + fahrenheit);
	}
	
	public void fahrenheitToKelvin() {
		double kelvin = ((fahrenheit.getTemperature() - 32) * 0.5556) + 273.15;
		System.out.println(fahrenheit.getTemperature() + " F degrees in K = " + kelvin);
	}
}
