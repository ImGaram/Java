package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch~case문
		int ranking = 1;
		char medalcolor;
		switch(ranking) {
		case 1: medalcolor = 'G';
				break;
		case 2: medalcolor = 'S';
				break;
		case 3: medalcolor = 'B';
				break;
		default:
				medalcolor='A';
		}
		System.out.println(ranking +"등 메달의 색깔은"+ medalcolor +"입니다");
	}

}
