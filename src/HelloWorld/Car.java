package HelloWorld;

public class Car {
	private String Brand;
	private double Price;
	private String Owner;
	
	public Car() {
		super();
	}
	public Car(String brand, double price, String owner) {
		super();
		Brand = brand;
		Price = price;
		Owner = owner;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}

	
}
