package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue
		int total=0;
		int num;
		
		for (num=1;num<=100;num++) {	//100���� �ݺ�
			if(num%2==0) 	//num�� ¦���� ���
				continue;	//���� ���� ����
			total+=num;		//num���� Ȧ���� ���� ����
		}
		System.out.println("1���� 100������ Ȧ���� ����: "+total+"�Դϴ�");
	}

}
