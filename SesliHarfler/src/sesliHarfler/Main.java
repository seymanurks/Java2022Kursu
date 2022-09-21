package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'F';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':	
		case 'U':
			System.out.println("Kalin sesli harf");
			break;

		default:
			System.out.println("İnce sesli harf");
		}

	}

}
