package loopexample;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do while문
		int num=1;
		int sum=0;
		
		do {	//조건식이 참이 아니더라도 한 번은 수행함
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("1부터 10까지의 합은"+sum+"입니다.");
	}

}
