import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Çekilmeksini istediğiniz fotokopi sayfa sayısını giriniz : ");
		
		int n = scanner.nextInt();
		
		int fiyat = fiyatHesapla(n);
		
		System.out.println("Fotokopinin fiyatı : " + fiyat);
		
		int ozyinelemeliFiyat = özyinelemeliFiyatHesapla(n);
		
		System.out.print("Fotokopinin fiyatı : " + ozyinelemeliFiyat);
		
		
	
		

	}
	
	public static int fiyatHesapla(int n) {
		
		if(n > 0 && n < 12) {
			
			return n * 5;
		}else if(n == 12) {
			
		  return 50;
		  
		}else   {
			
			return n * 4;
		}
		
	}
	
	public static int özyinelemeliFiyatHesapla(int n) {
		if (n == 1) {
			return 5;
		}else if(n > 1 && n < 12)  {
			
			return 5 + özyinelemeliFiyatHesapla(n - 1);
		}else if ( n == 12) {
			return 50;
		}else if(n < 25) {
			return 4 + özyinelemeliFiyatHesapla(n- 1);
		}else {
			return 100;
		}
		
	}
	
	

}
