import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yapılmasını istediğiniz işlemi seçiniz :\n1. girilen sayının asal olup olmadığını bulan program  \n"
				+ "2. girilen sayı kadar fibonacci terimini ekrana yazdıran program  \n"
				+ "3. girilen sayının mükemmel sayı olup olmadığını bulan program ");
		int secim = scanner.nextInt();
		
		for(int sayac = 0; sayac < secim; sayac++) {
			if(secim == 1) {
				System.out.print("Bir sayı girin : ");
				
				int number = scanner.nextInt();
				
				boolean asalMi = true;
				
				for(int i = 2; i < number; i++) {
					if(number % i == 0) {
						asalMi = false;
						break;
					}else
						asalMi = true;
				}
				
				if(asalMi) {
					System.out.println(number + " bir asal sayıdır.");
				}else {
					System.out.println(number + " asal sayı değildir.");
				}
				
			}
				else if(secim == 2) {
					System.out.print("Fibonacci serisinin kaç terimini görmek istersiniz ? ");
					
					int terimSayisi = scanner.nextInt();
					
					int[] fibonacci = new int[terimSayisi];
					
					int sayi1 = 0;
					int sayi2 = 1;
					int toplam;
					
					for(int j = 0; j < terimSayisi; j++) {
						
							fibonacci[j] = sayi1;
							toplam = sayi1 + sayi2;
							sayi1 = sayi2;
							sayi2 = toplam;
							
					}
					
					System.out.print("Fibonacci serisinin ilk " + terimSayisi + " terimi : ");
					for (int i : fibonacci) {
						System.out.print(i);
					}
					break;
				}
					else if(secim == 3) {
						System.out.print("Bir sayı girin : ");
						
						int sayi5 = scanner.nextInt();
						int toplam2 = 0;
						
						for(int k = 1; k < sayi5; k++) {
							if(sayi5 % k == 0) {
								toplam2 += k;
							}else
								continue;
						}
						
						if(sayi5 == toplam2) {
							System.out.println(sayi5 + " mukemmel bir sayıdır.");
						}else {
							System.out.println(sayi5 + " mukemmel bir sayı değildir");
						}
						break;

					} 
				}
			}
		
		
		
		
		
		
		
		
		
		
	}


