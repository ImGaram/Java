package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 ='Z';
		System.out.println(ch1);	//문자 출력, 문자 = '', 문자열 = ""
		System.out.println((int)ch1);	//문자에 해당하는 정수 값 출력(아스키코드)
		
		char ch2 = 38;
		System.out.println(ch2);	//정수 값에 해당하는 문자 출력
		
		int ch3 = 97;
		System.out.println(ch3);	//문자 정수값 출력
		System.out.println((char)ch3);	//정수 값에 해당하는 문자 출력
	}

}
