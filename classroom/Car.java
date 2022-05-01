package week4.day1;

public class Car extends Vehicle {
	public void ABS() {
		System.out.println("ABS");
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.applybrake();
		obj.soundHorn();
	}
}