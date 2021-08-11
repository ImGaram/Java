package ifexample;

public class SwitchCsae2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case에 문자열 사용하기
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다");
			break;
		case "Sliver":
			System.out.println("은메달입니다");
			break;
		case "Bronze":
			System.out.println("동메달입니다");
			break;
		default:
			System.out.println("메달이 없습니다");
		}
	}

}
