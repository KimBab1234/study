
public class Ch7_1 {
	////매개변수 다형성 연습

	public static void main(String[] args) {

		Buyer jenny = new Buyer();
		jenny.buy(new Computer()); //자손 객체를 넣었지만 실제로 Product로 형변환되어 들어감
		//참조 변수를 만들지 않고 객체만 만들어서 넣기 때문에 이 메서드 안에서는 만든 객체를 사용할수없음
		jenny.buy(new Tv());
		jenny.cartstatus();
	}

}
class Product{ //조상 클래스

	int price;
	int bonuspoint;

	Product(){} //기본생성자
	Product(int n, int m){ price = n; bonuspoint = m;} //기본생성자 오버라이딩

}
class Tv extends Product{

	Tv() { super(100,10); } //Tv 객체 기본 생성자. Product에 값 넣어줌
	public String toString() { return "TV"; } //String 반환하는 toString함수 오버라이딩

}
class Computer extends Product{

	Computer() { super(200,20); } // 컴퓨터 객체 기본 생성자
	public String toString() { return "컴퓨터"; }
}
class Refri extends Product{

	Refri() { super(300,30); } // 컴퓨터 객체 기본 생성자
	public String toString() { return "냉장고"; }
}
class Buyer{

	int money = 1000; //갖고있는돈
	int bonuspoint = 0; //보너스포인트
	Product cart[] = new Product[10];

	int i = 0; //카트에 담긴 갯수
	void buy(Product p) { //들어오는 매개변수를 Product형으로 형변환해서 참조변수 p에다 넣음

		money -= p.price;
		bonuspoint += p.bonuspoint;
		System.out.println(p + " 구입 완료!"); //그냥 p를 써도 p.toString으로 변환되기에 오버라이딩된걸로 들어감
		//조상으로 형변환 됐지만 실제 객체 p는 자손의 형태이기에 p.toString이 가능한것임
		System.out.println(money + "만원 남았습니다.");
		System.out.println(bonuspoint + "점 쌓였습니다.");
		cart[i++] = p; //p 객체를 담음

	}

	void cartstatus() { 

		int sum=0;

		if(cart[0]==null) { System.out.println("카트에 담긴 물건이 없습니다.");}
		else {
			System.out.printf("%n");
			System.out.printf("현재 카트에 담긴 물건 :");

			for(int cnt=0; cnt<i; cnt++) {
				System.out.printf(" %s", cart[cnt]);
				sum += cart[cnt].price;
			}

			System.out.printf("%n");
			System.out.println("현재 총 금액 " + sum + "만원 입니다.");

		}
	}


}


