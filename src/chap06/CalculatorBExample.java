package chap06;

public class CalculatorBExample {

	public static void main(String[] args) {
		CalculatorB myClcuB = new CalculatorB();
		
		
		double result1 = myClcuB.areaRectangle(10);
		
		double result2 = myClcuB.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);

	}

}


