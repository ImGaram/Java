package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue
		int total=0;
		int num;
		
		for (num=1;num<=100;num++) {	//100까지 반복
			if(num%2==0) 	//num이 짝수일 경우
				continue;	//이후 수행 생략
			total+=num;		//num값이 홀수일 때만 수행
		}
		System.out.println("1부터 100까지의 홀수의 합은: "+total+"입니다");
	}

}
