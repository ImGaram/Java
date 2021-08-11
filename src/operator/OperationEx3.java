package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//관계 연산자, 논리 연산자
		int num1=10;
		int i=2;
		
		boolean value =((num1=num1+10)<10) && ((i=i+2)<10);	//논리 곱에서 앞 항의 결과 값이 거짓 이므로 i는 수행되지 않음 i=2
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value =((num1=num1+10)>10) || ((i=i+2)<10);	//논리 곱에서 앞 항의 결과 값이 참 이므로 i는 수행되지 않음 i=2
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
