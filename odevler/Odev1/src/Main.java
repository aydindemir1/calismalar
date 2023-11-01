
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	   Scanner reader = new Scanner(System.in);
	   
	   System.out.println("Öğrenci sayısını giriniz : ");
	   
	   int ogrenciSayisi = reader.nextInt();
	 
	   int vizeNotu,finalNotu;
	   double ortalama;
	   
	   for(int i = 1; i <= ogrenciSayisi; i++) {
		   
		   System.out.println("Öğrenci " + i + " : ");
		   
		   
		   
		   System.out.println("Adı : ");
		   String name = reader.nextLine();
		   reader.next();
		   
		   
		   System.out.println("Vize notu : ");
		   vizeNotu = reader.nextInt();
		   
		   System.out.println("Final Notu : ");
		   finalNotu = reader.nextInt();
		   
		   ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
		   
		   String harfNotu;
		   
		   if(ortalama >= 90) {
			   harfNotu = "AA";
		   }else if(ortalama >= 80){
			   harfNotu = "BA";
		   }else if(ortalama >= 70){
			   harfNotu = "BB";
		   }else if(ortalama >= 60){
			   harfNotu = "CB";
		   }else if(ortalama >= 50){
			   harfNotu = "CC";
		   }else if(ortalama >= 40){
			   harfNotu = "DC";
		   }else if(ortalama >= 30){
			   harfNotu = "DD";
		   }else {
			   harfNotu = "FF";
		   }
		   
		   System.out.println("Genel Notu : " + (int)ortalama + " - " + harfNotu);
		   
		   
		   
	   }

	}

}
