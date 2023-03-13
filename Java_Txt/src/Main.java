import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		File file = new File("C:\\Users\\alper\\OneDrive\\Masaüstü\\ogrenciler.dat\\");

		if (file.createNewFile()) {
			System.out.println("Dosya Oluşturuldu");
		} else {
			System.out.println("Dosya Zaten Var");
		}

		System.out.println("--İŞLEM TÜRÜ--");
		System.out.println(
				"1-Kayıt Ekle\n" + "2-Kayıtları Listele\n" + "3-Kayıt Ara\n" + "4-Kayıt Düzenle\n" + "5-Çıkış");
		int secim = scanner.nextInt();

		switch (secim) {
		case 1:
			kayitEkle();
			break;
		case 2:
			kayitListele();
			break;
		case 3:
			kayitAra();
			break;
		case 4:
			kayitDuzenle();
			break;
		case 5:
			System.out.println("ÇIKIŞ YAPILDI");
			break;
		}
	}

	public static void kayitEkle() throws IOException {
		File file = new File("C:\\Users\\alper\\OneDrive\\Masaüstü\\ogrenciler.dat\\");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Ad: ");
			String ad = scanner.nextLine().toLowerCase();
			System.out.print("Soyad: ");
			String soyAd = scanner.nextLine().toLowerCase();
			System.out.print("Numara: ");
			String numara = scanner.nextLine().toLowerCase();
			System.out.print("Bölüm: ");
			String bolum = scanner.nextLine().toLowerCase();
			System.out.print("Cinsiyet: ");
			String cinsiyet = scanner.nextLine().toLowerCase();
			System.out.print("Doğum Yeri: ");
			String dogumYeri = scanner.nextLine().toLowerCase();
			System.out.print("Yaş: ");
			String yaş = scanner.nextLine().toLowerCase();
			System.out.print("Telefon: ");
			String telefon = scanner.nextLine().toLowerCase();
			System.out.println("KAYIT EKLENDİ");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("C:\\Users\\alper\\OneDrive\\Masaüstü\\ogrenciler.dat\\", true));
			writer.write("AD: " + ad + " \t");
			writer.write("SOYAD: " + soyAd + " \t");
			writer.write("NO: " + numara + " \t");
			writer.write("BÖLÜM: " + bolum + " \t");
			writer.write("CİNSİYET: " + cinsiyet + " \t");
			writer.write("DOĞUM YERİ: " + dogumYeri + " \t");
			writer.write("YAŞ: " + yaş + " \t");
			writer.write("TELEFON: " + telefon + " \n");
			writer.newLine();
			writer.close();
			break;
		}
		

	}

	public static void kayitListele() throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File("C:\\Users\\alper\\OneDrive\\Masaüstü\\ogrenciler.dat\\");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();

	}

	public static void kayitAra() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ÖĞRENCİ İSMİ: ");
		String kelime = scanner.nextLine().toLowerCase();

		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\alper\\OneDrive\\Masaüstü\\ogrenciler.dat\\"));
		String satir = reader.readLine();

		while (satir != null) {
			if (satir.contains(kelime)) {
				int kelimeIndex = satir.indexOf(kelime);
				System.out.println("AD:" + satir.substring(kelimeIndex));
				break;
			}
			satir = reader.readLine();
		}
		reader.close();

	}

	public static void kayitDuzenle() throws IOException {
		Scanner scanner = new Scanner(System.in);
		File file = new File("C:\\Users\\alper\\OneDrive\\Masaüstü\\ogrenciler.dat\\");
		System.out.print("DEĞİŞECEK BİLGİ: ");
		String degisenBilgi = scanner.nextLine().toLowerCase();
		System.out.print("YENİ BİLGİ: ");
		String yeniBilgi = scanner.nextLine().toLowerCase();

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String satir = "", bilgi = "";

		while ((satir = reader.readLine()) != null) { 
			bilgi += satir + System.lineSeparator();
		}
		reader.close();

		bilgi = bilgi.replaceFirst(degisenBilgi, yeniBilgi);

		FileWriter writer = new FileWriter(file);
		writer.write(bilgi);
		writer.close();

		System.out.println("Dosya Başarıyla Değiştirildi.");

	}

}
