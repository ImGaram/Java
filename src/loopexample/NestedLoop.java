package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ÁßÃ¸ ¹Ýº¹¹®
		int dan;
		int times;
		for (dan=2; dan<=9;dan++) {
			for (times=1;times<=9;times++) {
				if (times>=dan)
					continue;
				System.out.println(dan+"*"+times+"="+dan*times);
			}
			System.out.println();	//ÇÑ ÁÙ ¶ç¿ì±â
		}
	}

}
