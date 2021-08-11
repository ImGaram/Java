package chapter2;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUM = 100;	//상수 선언과 동시에 초기화
		final int MIN_NUM;	//상수 = 변하지 않는 수
		
		MIN_NUM = 0;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;	//상수는 값을 변경할수 없음
	}

}
