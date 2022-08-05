
public class Scorearr {

	public static void main(String[] args) {

		int[] score = { 95, 80, 70, 100, 85 };
		int total = 0;
		int maxx = score[0];
		int minn = score[0];
		
		for(int cnt=0; cnt< score.length; cnt++ )
		{
			total += score[cnt];
			if(score[cnt]>maxx) { maxx=score[cnt]; } //최대값
			if(score[cnt]<minn) { minn=score[cnt]; } //최소값
			
		}
		
		System.out.println("============");
		System.out.println("총합:"+total+"점, 평균: "+total/score.length+"점");
		System.out.println("최솟값:"+minn+"점, 최댓값: "+maxx+"점");
		

	}

}
