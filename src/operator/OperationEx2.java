package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ������
		int gameScore = 150;	//���ӿ��� ȹ ���� ������ 150
		
		int lastScore1 = ++gameScore;	//gameScore�� 1��ŭ ���� ���� lastScore�� ����
		System.out.println(lastScore1);	//151
		
		int lastScore2 = --gameScore;	//gameScore�� 1��ŭ �� ���� lastScore�� ����
		System.out.println(lastScore2);	//150
		
		
		int lastScore3 = gameScore++;	//gameScore�� lastScore�� ���� ���� 1�� ����
		System.out.println(lastScore3);	//150
		
		int lastScore4 = gameScore--;	//gameScore�� lastScore�� ���� ���� 1�� ��
		System.out.println(lastScore4);	//151
	}

}