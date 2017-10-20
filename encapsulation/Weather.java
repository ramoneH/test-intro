package encapsulation;

public class Weather {
	private String city;
	private String state;
	private int tempHigh;
	private int tempLow;

	public int getTempLow() {
		return tempLow;
	}
	public void setTempLow(int tempLow) {
		this.tempLow = tempLow;
	}
	public int getTempHigh() {
		return tempHigh;
	}
	public void setTempHigh(int tempHigh) {
		this.tempHigh = tempHigh;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
