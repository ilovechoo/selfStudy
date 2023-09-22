package chap05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length ); //(원본 배열, 원본 배열 시작 인덱스(위치), 새배열, 붙여넣을 시작인덱스, 복사할 개수)

		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " , ");
			
		}
				
				
	}

}
