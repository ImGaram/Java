package chapter2;

public class ExplictConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� ����ȯ
		int inum=1000;
		byte bnum= (byte)inum;	//������ ���� �ٲٷ��� �ٲ� ���� ��ȣ�� �Ἥ ����ؾ� ��
		
		System.out.println(bnum);	//1000�� byte�� ���� ������ �ѱ� ������ -24�� ǥ�õ�
		
		double dNum1 = 1.2;
		float fNum2=0.9f;
		
		int iNum3=(int)dNum1 +(int)fNum2;	//�� �Ǽ��� ���� ����ȯ�Ǿ� ������
		int iNum4=(int)(dNum1+fNum2);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
