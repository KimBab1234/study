
public class No6_1 {

	public static void main(String[] args) {

		Student s = new Student("홍길동", 1,1,100,60,76);
		System.out.println("총점: "+s.getTotal());
		System.out.println("평균: "+s.getAvg());
		
	}

}

class Student{
	
	String name;
	int[] score = new int[5];

	
	Student(){ } //기본 생성자
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		
		this.name = name;
		this.score[0]= ban;
		this.score[1]= no;
		this.score[2]= kor;
		this.score[3]= eng;
		this.score[4]= math;
		
	}
	
	public int getTotal()
	{
		int total=this.score[2]+this.score[3]+this.score[4];
		
		return total;
	}
	
	public float getAvg() {
		
		float avg= (float)(this.getTotal())/3;
		avg *= 10;
		avg = (float)Math.round(avg);
		avg /=10;
		
		return avg;
	}
	
}
