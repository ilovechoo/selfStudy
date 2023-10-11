package chao01_03;

public class ConditionaloperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score > 80) ? 'B' : 'C'); //삼항연산자
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
