
public class No6_4 { //6_6 문제와 이어짐. 인스턴스 메서드 활용

	public static void main(String[] args) {

		Mypoint me = new Mypoint(1,1);
		System.out.println(me.getDistance(2,2)); 
	}
	
	

}
class Mypoint{
	
	int x; int y;
	Mypoint() {}; //기본자 생성
	Mypoint(int x1, int y1) { this.x=x1; this.y=y1;}
	
	
	public double getDistance(int x1, int y1) {
		
		return Math.sqrt((double)((x1-x)*(x1-x) + (y1-y)*(y1-y)));
	}
	
	
}
