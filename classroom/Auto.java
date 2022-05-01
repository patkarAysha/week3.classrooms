package week4.day1;

public class Auto extends Vehicle {
	public void kickStart() {
		System.out.println("Auto Kick");
	}

	public static void main(String[] args) {
	Auto obj=new Auto();
	obj.applybrake();
	obj.soundHorn();
	obj.kickStart();
	}
}