package deserialization.getWeather;

public class Main {

	private String temp;
	private String feels_like;
	private String temp_min;
	private String temp_max;
	private String pressure;
	private String humidity;
	private String sea_level;
	private String grnd_level;
	
	public String getSea_level() {
		return sea_level;
	}
	public void setSea_level(String sea_level) {
		this.sea_level = sea_level;
	}
	public String getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(String grnd_level) {
		this.grnd_level = grnd_level;
	}
	
	public String getTemp() {
		return temp;
	}
	public String getFeels_like() {
		return feels_like;
	}
	public String getTemp_min() {
		return temp_min;
	}
	public String getTemp_max() {
		return temp_max;
	}
	public String getPressure() {
		return pressure;
	}
	public String getHumidity() {
		return humidity;
	}
	
}
