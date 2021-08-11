package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum=10;
		int iNum=bNum;	//byte 형 변수가 int형 변수에 대입됨
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum=iNum2;	//int 형 값이 float 형 변수에 대입됨
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum+iNum;
		System.out.println(dNum);
	}

}
