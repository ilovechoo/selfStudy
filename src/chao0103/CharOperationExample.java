package chao0103;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char) (c2 + 1); //char변수가 산술여 연산에 사용되면 int타입으로 변환 - char타입으로 변경해야함
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		
	}

}
