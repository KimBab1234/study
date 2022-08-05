
public class Mathclass {
	
	public static void main(String args[]) {
		
		int a=5, b=3;
		Mathstudy mm = new Mathstudy(); //참조변수가 있어야 다른 class 사용가능
		
		int temp1 = mm.add(a,b);
		System.out.printf("합은 %d입니다.%n", temp1);
		temp1 = mm.minus(a,b);
		System.out.printf("차는 %d입니다. %n", temp1);
		temp1 = mm.max(a, b);
		System.out.printf("더 큰 값은 %d입니다. %n", temp1);
		
		mm.gugudan(a);
		
	}
	

}

class Mathstudy{
	
	void gugudan(int dan) {
		
		System.out.printf("=====%d단 출력=====%n",dan);
		for(int cnt=1; cnt<=9; cnt++)
		{
			System.out.printf("%d*%d=%d %n",dan,cnt,dan*cnt);
		}
		
	}
	
	
	int add(int a, int b) {
		return a+b;
	}
	int max(int a, int b) {
		
		return (a>b)? a:b; //a>b가 true=a, false=b return함
		
	}
	
	int minus(int a, int b) {
		int result= a-b;
		return result;
	}
	
	
}
