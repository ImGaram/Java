package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while
		int num=1;
		int sum=0;
		
		while(num<=10) {	//num값이 10보다 작거나 같을 동안(조건식이 참일 동안 반복 수행)
			sum+=num;	//합계를 뜻하는 sum에 num을 더하고
			num++;	//num에서 1씩 더해 나감
		}
		System.out.println("1부터 10까지의 합은"+sum+"입니다");
	}

}