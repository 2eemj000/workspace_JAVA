package chap03;

public class Test24 {

	public static void main(String[] args) {
		String nation = "kor";
		
		switch(nation) {
		case "kor":
		case "jpn":
		case "chn":
			System.out.println("아시아");
			break;
		case "gbr":
		case "fra":
		case "eua":
			System.out.println("유럽");
			break;
		case "usa":
		case "can":
		case "mex":
			System.out.println("아메리카");
			break;
		}

	}

}
