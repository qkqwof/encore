package domain;

public class weather {
	private String region;
	private int wind;
	private int temp;
	private int rain;
	
	public weather() {
		super();
	}
	public weather(String region, int wind, int temp, int rain) {
		super();
		this.region = region;
		this.wind = wind;
		this.temp = temp;
		this.rain = rain;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getWind() {
		return wind;
	}
	public void setWind(int wind) {
		this.wind = wind;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getRain() {
		return rain;
	}
	public void setRain(int rain) {
		this.rain = rain;
	}
	@Override
	public String toString() {
		return "weather [region=" + region + ", wind=" + wind + ", temp=" + temp + ", rain=" + rain + "]";
	}
	
	
}
