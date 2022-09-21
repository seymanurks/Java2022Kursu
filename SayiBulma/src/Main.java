
public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,2,3,4,5,6,7,8,9};
		int arananSayi = -5;
		boolean varMi = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i] == arananSayi) {
				varMi = true;
			}
		}
		
		if (varMi) {
			System.out.println("Aranan sayi bulundu.");
				
		}
		else {
			System.out.println("Aranan sayi bulunamadi.");
		}
		
	}

}
