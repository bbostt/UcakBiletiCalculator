import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {

	public static void main(String[] args) {
		int yas, mesafe, selection;
		double normalTutar, toplamTutar = 0, yasIndirimi = 0, indirimliTutar = 0, gidisDonusIndirimi = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yasinizi giriniz :");
		
		yas = input.nextInt();
		
		System.out.print("Mesafe giriniz :");
		
		mesafe = input.nextInt();
		
		normalTutar = mesafe * 0.10;
		
		if(yas < 12) {
			yasIndirimi = normalTutar * 0.5;
			indirimliTutar = normalTutar - yasIndirimi;
			
			System.out.println("Normal    Tutar : "+normalTutar);
			System.out.println("Yas    Indirimi : "+yasIndirimi);
			System.out.println("Indirimli Tutar : "+indirimliTutar);
			
		}
		else if((12 <= yas) && (yas <=24)) {
			yasIndirimi = normalTutar * 0.1;
			indirimliTutar = normalTutar - yasIndirimi;
			
			System.out.println("Normal    Tutar : "+normalTutar);
			System.out.println("Yas    Indirimi : "+yasIndirimi);
			System.out.println("Indirimli Tutar : "+indirimliTutar);
			
		}
		else if(yas > 65) {
			yasIndirimi = normalTutar * 0.30;
			indirimliTutar = normalTutar - yasIndirimi;
			
			System.out.println("Normal    Tutar : "+normalTutar);
			System.out.println("Yas    Indirimi : "+yasIndirimi);
			System.out.println("Indirimli Tutar : "+indirimliTutar);
		}
		
		System.out.println("Yolculuk tipini seçiniz");
		System.out.print("1 => Tek Yön , 2 => Gidiþ Dönüþ : ");
		selection = input.nextInt();
		
		switch(selection) {
		    case 1:
		    	System.out.println("Normal    Tutar : "+normalTutar);
				System.out.println("Yas    Indirimi : "+yasIndirimi);
				System.out.println("Indirimli Tutar : "+indirimliTutar);
				break;
		    case 2:
		    	gidisDonusIndirimi = indirimliTutar * 0.20;
		    	toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
		    	System.out.println("Normal    Tutar : "+normalTutar);
				System.out.println("Yas    Indirimi : "+yasIndirimi);
				System.out.println("Indirimli Tutar : "+indirimliTutar);
				System.out.println("Gidiþ Dönüþ Indýrýmý : "+gidisDonusIndirimi);
				System.out.println("Toplam Tutar : "+toplamTutar);			
		    	
		    	
		    	
		}

	}

}
