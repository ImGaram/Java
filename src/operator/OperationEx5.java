package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0B00000101;	//5�� 8��Ʈ 2����
		
		System.out.println(num<<2);	//�������� 2��Ʈ �̵� 00010100(20)
		System.out.println(num>>2);	//���������� 2��Ʈ �̵�00000001(1)
		System.out.println(num>>>2);	//���������� 2��Ʈ �̵�00000001(1)
		
		System.out.println(num);	//num�� �ƹ� ���� �������� �ʾ����Ƿ� 5 ���
		num<<=2;	//2��Ʈ �̵��� ���� num�� ����
		System.out.println(num);
	}

}
