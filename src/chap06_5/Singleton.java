package chap06_5;

public class Singleton {

	//필드
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적 메소드
	static Singleton getInstance() {  //getInstance 외부에서 객체를 얻는 유일한 방법
		return singleton;
	}
	
	
	
	
}
