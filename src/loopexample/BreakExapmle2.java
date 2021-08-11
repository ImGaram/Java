package loopexample;

public class BreakExapmle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break문
		int num=0;
		int sum=0;
		
		for (num=0;;num++) {	//조건식을 생략하는 대신 break문을 사용함
			sum+=num;
			if(sum>=100)	//sum이 100보다 크면
				break;		//반복 중단
		}
		System.out.println("num :"+num);
		System.out.println("sum :"+sum);
	}

}
