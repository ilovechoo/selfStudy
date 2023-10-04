package chap06;

public class CarBExample {

	public static void main(String[] args) {
		CarB carb1 = new CarB();
		System.out.println("carb1.company : " +  carb1.company);
		System.out.println();
		
		CarB carb2 = new CarB("자가용");
		System.out.println("carb2.company : " +  carb2.company);
		System.out.println("carb2.model : " +  carb2.model);
		System.out.println();
		
		CarB carb3 = new CarB("자가용", "검정");
		System.out.println("carb3.company : " +  carb3.company);
		System.out.println("carb3.model : " +  carb3.model);
		System.out.println("carb3.color : " + carb3.color);
		System.out.println();
		
		CarB carb4 = new CarB("자가용", "검정", 200);
		System.out.println("carb4.company : " +  carb4.company);
		System.out.println("carb4.model : " +  carb4.model);
		System.out.println("carb4.color : " + carb4.color);
		System.out.println("carb4.maxSpeed : " + carb4.maxSpeed);
		System.out.println();
		
		
		
	}

}
