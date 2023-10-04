package chap06;

public class MSExample {

	public static void main(String[] args) {
		MS ms1 = new MS();
		System.out.println("ms1.company : " + ms1.company);
		System.out.println();
		
		MS ms2 = new MS("자가용");
		System.out.println("ms2.company : " + ms2.company);
		System.out.println("ms2.model : " + ms2.model);
		System.out.println();
		
		MS ms3 = new MS("자가용", "빨강");
		System.out.println("ms3.company : " + ms3.company);
		System.out.println("ms3.model : " + ms3.model);
		System.out.println("ms3.color : " + ms3.color);
		System.out.println();
		
		MS ms4 = new MS("택시", "검정", 200);
		System.out.println("ms4.company : " + ms4.company);
		System.out.println("ms4.model : " + ms4.model);
		System.out.println("ms4.color : " + ms4.color);
		System.out.println("ms4.maxSpeed : " + ms4.maxSpeed);
		System.out.println();
	}

}
