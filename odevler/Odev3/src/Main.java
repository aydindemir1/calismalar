import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Girmek istediğiniz metni giriniz : ");
		
		String text = scanner.nextLine();
		
		String newText = convertToStringWithStars(text);
		
		System.out.println(newText);
		
		
		
		
		
		
		
		

	}
	public static String convertToStringWithStars(String text){
		
		String yeniMetin = "";
		
		for(int i= 0; i < text.length(); i++) {
			if(i == text.length()-1) {
				if(text.charAt(i) == ' ' || text.charAt(i) == ',' || text.charAt(i) == '.') {
					yeniMetin += text.charAt(i);
				}else {
					yeniMetin += text.charAt(i);
				}
			}else if(text.charAt(i) == ' ' || text.charAt(i) == ',' || text.charAt(i) == '.' || text.charAt(i + 1) == ' ' || text.charAt(i + 1) == ',' || text.charAt(i + 1) == '.') {
				yeniMetin += text.charAt(i);
			}else {
				yeniMetin += text.charAt(i) + "*";
			}
		}
		
		return yeniMetin;
	}
		

}
