package chap04;

public class ForTriangle1 {

	public static void main(String[] args) {
		
		int rows = 5; // 행의 수를 설정합니다.                                    //틀이라고 생각하지 않기

        for (int i = 1; i <= rows; i++) {
            // 공백을 출력합니다.
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 별을 출력합니다.
            for (int k = 1; k <= 2 * i - 1; k++) { //직사각형 k <= i
                System.out.print("*");
            }

            System.out.println(); // 다음 줄로 넘어갑니다.
        }
    
				
			System.out.println();
	}
	
}



