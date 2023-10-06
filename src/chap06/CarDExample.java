package chap06;

public class CarDExample {

	public static void main(String[] args) {
		CarD myCarD = new CarD();
		
		myCarD.keyTurnOn();
		myCarD.run();
		int speed = myCarD.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
		

	}

}
