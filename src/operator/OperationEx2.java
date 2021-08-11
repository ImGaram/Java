package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감 연산자
		int gameScore = 150;	//게임에서 획 득한 점수는 150
		
		int lastScore1 = ++gameScore;	//gameScore에 1만큼 더한 값을 lastScore에 대입
		System.out.println(lastScore1);	//151
		
		int lastScore2 = --gameScore;	//gameScore에 1만큼 뺀 값을 lastScore에 대입
		System.out.println(lastScore2);	//150
		
		
		int lastScore3 = gameScore++;	//gameScore를 lastScore에 대입 그후 1을 더함
		System.out.println(lastScore3);	//150
		
		int lastScore4 = gameScore--;	//gameScore를 lastScore에 대입 그후 1을 뺌
		System.out.println(lastScore4);	//151
	}

}