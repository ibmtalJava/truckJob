package truckJob;

public class Truck {
	private String plateNumber;
	private String brand;
	private String model;
	private Driver driver;
	public Truck() {
		super();
	}
	public Truck(String plateNumber, String brand, String model) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.model = model;
	}
	public Truck(String plateNumber, String brand, String model, Driver driver) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.model = model;
		this.driver = driver;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}
