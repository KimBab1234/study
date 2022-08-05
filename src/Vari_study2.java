
////참조형 매개변수 이해
//원래 Datasave class 선언했었는데 이미 Vari_study에 선언되어있어서 중복선언 에러남..

public class Vari_study2 { //Vari_study2 클래스의 멤버는 main 메서드, change 메서드 2개임

	public static void main(String[] args) {

		Datasave ch = new Datasave(); //Datasave 클래스 객체 생성
		ch.x = 10; //10저장, y는 그대로 0임
		ch.yy(); //ch 객체에 한해서 yy 메서드 실행해서 y=x*2가 실행되자 y=20 저장됨

		System.out.printf("x는 %d, y는 %d입니다.%n",ch.x,ch.y); //y 20 저장됨

		System.out.printf("ch 주소 %s%n",ch);
		Datasave ch2 = new Datasave(); //Datasave 클래스 객체 생성
		
		//같은 class에 있고 static 메서드라서 객체 생성과 참조변수 안썼음
		System.out.printf("=====no change=====%n");
		ch2=nochange(ch); //change 메서드 사용, 인풋으로 객체 ch를 넣음, 반환값은 ch2에 저장
		System.out.printf("(nochange ch)x는 %d, y는 %d입니다. %n",ch.x,ch.y); //change 메서드로 바뀐 값 나옴
		
		System.out.printf("=====change=====%n");
		ch2=change(ch); //change 메서드 사용, 인풋으로 객체 ch를 넣음, 반환값은 ch2에 저장
		System.out.printf("(change ch)x는 %d, y는 %d입니다. %n",ch2.x,ch2.y); //change 메서드로 바뀐 값 나옴
	}

	static Datasave change (Datasave chinput) { //Datasave의 객체를 입력으로 받겠다, 그 이름은 ch2로 지정해서 change 메서드 내에서 사용함.
		
		Datasave temp = new Datasave(); //참조변수
		System.out.printf("temp 주소 %s%n",temp);

		temp=chinput; //입력으로 받은 ch 객체 주소를 temp에 저장함
		System.out.printf("temp 주소 %s%n",temp); //temp 주소가 바껴서 출력됨
		temp.x=1000; //temp가 가리키는 주소가 ch가 가리키는 주소와 같으므로 ch.x의 값도 바껴서 나오게됨
		
		System.out.printf("(change temp)x는 %d, y는 %d입니다. %n",temp.x,temp.y);
		
		return temp; //새로만든 객체 주소 반환

	} //종료 후 temp 참조변수는 사라지지만 ch 원본 값을 바껴있음
	
static Datasave nochange (Datasave chinput) { //Datasave의 객체를 입력으로 받겠다, 그 이름은 ch2로 지정해서 change 메서드 내에서 사용함.
		
		Datasave temp = new Datasave();

		temp.x=chinput.x; //입력으로 받은 ch.x 값만 temp.x에 저장함, 즉 주소는 다른 주소임
		temp.x=1000; //temp.x 값만 복사해왔으니 1000넣어도 ch 원본은 변경안됨
		System.out.printf("temp 주소 %s%n",temp); //새로 생성된 temp 주소가 출력됨 ch 주소와 다름
		System.out.printf("(no change temp)x는 %d, y는 %d입니다. %n",temp.x,temp.y);
		
		return temp; //새로만든 객체 주소 반환

	} //종료 후 temp 참조변수는 사라진다.

}
