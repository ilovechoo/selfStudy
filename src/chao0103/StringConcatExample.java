package chao0103;

public class StringConcatExample {

	public static void main(String[] args) {
		// 숫자연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("Str1: " + str1 );
		
		String str2 = 10 + "2" + 8;
		System.out.println("Str2: " + str2 );
		
		String str3 = 10 + 2 + "8";
		System.out.println("Str3: " + str3 );
		
		String str4 = "10" + (2 + 8);
		System.out.println("Str5: " + str4 );
		
		
		
		
	}

}
