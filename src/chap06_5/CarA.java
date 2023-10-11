package chap06_5;

public class CarA {

	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		CarA myCarA = new CarA();
		myCarA.speed = 60;
		myCarA.run();
	}
}
