package operator;

public class OperationEx1 {

	//산술 연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathScore = 90;
		int engScore = 70;
		int korScore = 85;
		
		int totalScore = mathScore + engScore + korScore;	//총점 구하기
		System.out.println(totalScore);
		
		double avgScore = totalScore /3.0;	//평균 구하기
		System.out.println(avgScore);
	}

}
