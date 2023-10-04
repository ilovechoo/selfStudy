package chap06;

public class CarB {
	
	String company = "테슬라";
	String model;
	String color;
	int maxSpeed;
	
	CarB(){
		
	}
	
	CarB(String model){
		this(model, "은색", 250);
	}
	
	CarB(String model, String color){
		this(model, color, 250);
	}
	
	CarB(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
