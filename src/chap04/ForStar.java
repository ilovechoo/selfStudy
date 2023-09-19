package chap04;

public class ForStar {

	public static void main(String[] args) {

		for(int i = 1; i<5; i++) { //1번 For문						*1번 for문 1일때 2번 for문이 끝날 때까지 실행*
			for(int j = 4; j>0; j--) {//2번 For문 					
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
		}
     
		System.out.println();
	   }
	}
}

/* for(int i = 1; i < 5; i++){      //차례대로 별찍기
	for(int j = 1; j <= i; j++) {
		System.out.print("*");
		if(j == i) {
		System.out.println();
	}
	}
 } */