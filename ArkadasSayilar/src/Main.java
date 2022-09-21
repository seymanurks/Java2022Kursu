public class Main {
	
	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi2 = 284;
		int sayi1toplam=0;
		int sayi2toplam =0;
		
		for (int i = 1; i < sayi1; i++) {
			
			if (sayi1%i == 0) {
				sayi1toplam +=i;
			}
			
			if (sayi2%i == 0) {
				sayi2toplam +=i;
			}
		}
		
		System.out.println(sayi1toplam +" " +sayi2toplam);
		if (sayi1toplam == sayi2 && sayi2toplam == sayi1) {
			System.out.println("arkadaş sayı");
		}
		else {
			System.out.println("değil");
		}
		
	}

}
