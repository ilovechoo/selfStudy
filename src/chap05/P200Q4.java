package chap05;

public class P200Q4 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 }; //for문을 이용하여 배열항목의 최대값구하기
	
		
		for(int i=0; i<array.length; i++) {
			  if (array[i] > max ) {
				   max = array[i] ; 
//				   array[i] = max;  같다라는 뜻이 아님
			 
	}

	}
		 System.out.println("max: " + max);
}
}
