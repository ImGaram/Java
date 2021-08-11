package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0B00000101;	//5의 8비트 2진수
		
		System.out.println(num<<2);	//왼쪽으로 2비트 이동 00010100(20)
		System.out.println(num>>2);	//오른쪽으로 2비트 이동00000001(1)
		System.out.println(num>>>2);	//오른쪽으로 2비트 이동00000001(1)
		
		System.out.println(num);	//num에 아무 값도 대입하지 않았으므로 5 출력
		num<<=2;	//2비트 이동한 값을 num에 대입
		System.out.println(num);
	}

}
