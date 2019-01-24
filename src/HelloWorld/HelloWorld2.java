package HelloWorld;

public class HelloWorld2 {

	public static void main(String[] arguments) {
	System.out.println("HelloWorld");
		String strA = "info";
		String strB = "My info";
		String strC = "My "+ strA; 
		System.out.println(strB == strC);
		Car carA = new Car("Benz",1000000.00,"Jack");
		System.out.println(carA.getOwner()+" has a "+carA.getBrand() + " costs "+ carA.getPrice());
		System.out.println(isExpensive(carA)?"Really Expensive":"Really Cheap");
		
	}
	public static boolean isExpensive(Car car) {
		if (car.getPrice() > 300000.00)
			return true;
		else return false;
	}
}
