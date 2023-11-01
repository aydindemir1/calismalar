import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Fibonacci serisinin kaç terimini görmek istersiniz ? ");

		BigInteger terimSayisi = 	BigInteger.valueOf(scanner.nextInt()) ;

		int[] fibonacci = new int[terimSayisi.intValue()];

		BigInteger sayi1 =  BigInteger.valueOf(1);
		BigInteger sayi2 =  BigInteger.valueOf(1);
		BigInteger toplam = new BigInteger("");

		for (int j = 0; j < terimSayisi.intValue(); j++) {

			fibonacci[j] = sayi1.intValue();
			toplam = toplam.add(sayi1).add(sayi2);
			sayi1 = sayi2;
			sayi2 = toplam;

		}

		System.out.print("Fibonacci serisinin ilk " + terimSayisi + " terimi : ");
		for (int i : fibonacci) {
			System.out.print(" ");
			System.out.print(i);
		}
		

	
	}

}
