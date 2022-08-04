
public class Studentscore {

	public static void main(String[] args) {

		int[][] score = {{ 80, 70, 60, 20, 30 },
						{100, 50, 10, 40, 60 },
						{90, 70, 30, 20, 50},
						{100, 90, 80, 60, 20},
						{ 10, 20, 30, 40, 50}};
		
		String[] name = {"A", "B", "C", "D", "E"};
		
		System.out.printf("===========성적표===========%n");
		System.out.printf("    국어   수학   영어   사회   과학 ");

		for(int stunum=0; stunum<5; stunum++) {
			System.out.printf("%n%s: ",name[stunum]);

			for(int sconum=0; sconum<5; sconum++) {
				System.out.printf("%d  ", score[stunum][sconum]);
			}
		}
		
		System.out.printf("%n==========================");
		}
}
