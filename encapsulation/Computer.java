package encapsulation;

public class Computer {

	private int hddSize;
	private double screenSize;
	private String OS;
	private String color;
	private double batteryLife;
	
	
	public int getHddSize() {
		return hddSize;
	}
	public void setHddSize(int hddSize) {
		this.hddSize = hddSize;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(double batteryLife) {
		this.batteryLife = batteryLife;
	}
	
	
}
