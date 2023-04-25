package tempConverter;

public class Converter {
	private Celsius celsius;
	private Fahrenheit fahrenheit;
	private Kelvin kelvin;
	private Rankine rankine;
	
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
	
	public void celsiusToRankine() {
		double rankine = ((celsius.getTemperature() * 1.8) + 491.67;
		System.out.println(celsius.getTemperature() + " C degrees  in R = " + rankine);
	}
	
	public void rankineToCelsius() {
		double celsius = ((rankine.getTemperature() - 491.67) / 1.8);
		System.out.println(rankine.getTemperature() + " R degrees in C = " + celsius);
	}
	
	public void fahrenheitToRankine() {
		double rankine = (fahrenheit.getTemperature() + 459.67);
		System.out.println(fahrenheit.getTemperature() + " F degrees in R = " + rankine);
	}
				 
	public void rankineToFahrenheit(){
		double fahrenheit = (rankine.getTemperature() - 459.67);
		System.out.println(rankine.getTemperature() + " R degrees in F = " + fahrenheit);
	}
	
	public void kelvinToRankine(){
		double rankine = (kelvin.getTemperature() * 1.8);
		System.out.println(kelvin.getTemperature() + " K degrees in R = " + rankine);
	}
	
	public void rankineToKelvin(){
		double kelvin = (rankine.getTemperature() / 1.8);
		System.out.println(rankine.getTemperature() + " R degrees in K = " + kelvin);
	}
}
