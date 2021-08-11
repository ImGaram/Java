package chapter2;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자료형
		//long
		//int num1 = 12345678900; int의 값의 범위를 넘음
		long num2=12345678900l;	//모든 정수값을 기본으로 int로 처리하기 때문에 long으로 처리하라고 숫자 끝에 l,L을 붙인다.
		long num = 1000;	//int의 범위를 넘지 않기 때문에 오류가 발생하지 않음
		//char
		char myChar = 'A';
		System.out.println(num);
		System.out.println(num2);
		System.out.println(myChar);
	}

}
