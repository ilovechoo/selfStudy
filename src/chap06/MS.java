package chap06;

public class MS {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	MS(){
		
	}
	
	MS(String model){
	 this.model = model;	
	}
	
	MS(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	MS(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
