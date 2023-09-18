package chap04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		
		while(true) { //p161, Q3
		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		System.out.println("(" + num1 + "," + num2 + ")");
		
		if((num1 + num2) == 5 ) {
			break;
		}
			
		}
		
		}

	}


