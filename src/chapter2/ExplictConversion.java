package chapter2;

public class ExplictConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//명시적 형변환
		int inum=1000;
		byte bnum= (byte)inum;	//강제로 형을 바꾸려면 바꿀 형을 괄호에 써서 명시해야 함
		
		System.out.println(bnum);	//1000이 byte의 값의 범위를 넘기 때문에 -24로 표시됨
		
		double dNum1 = 1.2;
		float fNum2=0.9f;
		
		int iNum3=(int)dNum1 +(int)fNum2;	//두 실수가 각각 형변환되어 더해짐
		int iNum4=(int)(dNum1+fNum2);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
