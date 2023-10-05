package chap06;

public class CarCExample {

	public static void main(String[] args) {
		CarC myCarC = new CarC();
		
		myCarC.setGas(5);
		
		boolean gasState = myCarC.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCarC.run();
		}
		
		if(myCarC.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
