package loopexample;

public class BreakExapmle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break��
		int num=0;
		int sum=0;
		
		for (num=0;;num++) {	//���ǽ��� �����ϴ� ��� break���� �����
			sum+=num;
			if(sum>=100)	//sum�� 100���� ũ��
				break;		//�ݺ� �ߴ�
		}
		System.out.println("num :"+num);
		System.out.println("sum :"+sum);
	}

}
