import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Tersten yazılmasını istediğiniz sayıyı giriniz : ");

		String sayi = scanner.nextLine();

		String newNumber = yeniNumber(sayi);

		System.out.println( "String ile tersten yazılmış sayı : " + newNumber);

		StringBuilder sayi1 = new StringBuilder(sayi);

		StringBuilder newNumber1 = yeniNumber1(sayi1);

		System.out.println( "String Builder ile tersten yazılmış sayı : " + newNumber1);
		
		
		

		System.out.print("Tersten yazılmasını istediğiniz metni giriniz : ");

		String metin = scanner.nextLine();

		String newText = yeniMetin(metin);

		System.out.println("String ile tersten yazılmış metin : " + newText);

		StringBuilder metin1 = new StringBuilder(metin);

		StringBuilder newText1 = yeniMetin1(metin1);

		System.out.println( "String Builder ile tersten yazılmış metin : " + newText1);

	}
	

	private static String yeniNumber(String sayi) {

		String newSayi = "";
		for (int i = sayi.length() - 1; i >= 0; i--) {
			newSayi += sayi.charAt(i);
		}
		return newSayi;
	}
	

	private static StringBuilder yeniNumber1(StringBuilder sayi1) {

		StringBuilder newSayi1 = new StringBuilder();
		for (int i = sayi1.length() - 1; i >= 0; i--) {
			newSayi1.append(sayi1.charAt(i));
		}
		return newSayi1;
	}

	
	private static String yeniMetin(String metin) {

		String yeniText = "";
		for (int i = metin.length() - 1; i >= 0; i--) {
			yeniText += metin.charAt(i);
		}
		return yeniText;
	}

	
	private static StringBuilder yeniMetin1(StringBuilder metin1) {

		StringBuilder yeniText1 = new StringBuilder();
		for (int i = metin1.length() - 1; i >= 0; i--) {
			yeniText1.append(metin1.charAt(i));
		}
		return yeniText1;
	}

}
