package sec;

import java.io.IOException;

public class ContinuekeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		} //입력된 모든 키코드를 읽고 다시 키가 입력 될 때가지 대기 상태

	}

}
