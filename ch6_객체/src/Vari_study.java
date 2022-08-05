
////기본형 매개변수 이해

//class Datasave { int x; int y=x*2; } // 이게 안되는 이유 : class는 선언문만 가능하다!
class Datasave { 
	
	int x; int y;
	void yy() { //메서드
		y=x*2;
	}
	
} //이렇게 고쳐줘야함

public class Vari_study {

	public static void main(String args[]) {

		Datasave ch= new Datasave(); //Datasave 클래스 객체 생성
		ch.x=10; //일단 10 저장
		
		System.out.printf("%d입니다.%n",ch.x);
		
		change(ch.x); //change 메서드에 ch.x 값을 인풋으로 넣음
		
		System.out.printf("%d입니다.%n",ch.x); //change 메서드는 기본형 매개변수 사용하여 실제 ch.x값은 그대로 10임
		
	}


	static void change(int x) { //이때 x는 change 메서드의 매개변수... 기본형으로 쓰였음

		x=1000; //10이 들어왔지만 메서드 내부에서 1000으로 바꿈
		System.out.printf("%d입니다.%n",x); // 1000 출력됨

	} //종료후 x는 1000의 값을 잃어버림

}
