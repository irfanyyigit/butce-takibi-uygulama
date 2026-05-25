import java.util.ArrayList;
import java.util.Scanner;
//uygulamada 4 secenek mevcut bunlar gelir eklemek, gider eklemek, özet göster, cıkıs islemleri tek bir dosya halinde mevcut14
//uygulamada herhangi bir sekilde arka planda kaydetme yok
public class ButceTakip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> islemler = new ArrayList<>();
        double bakiye = 0;

        while (true) {
            System.out.println("\n--- Kişisel Bütçe Takip ---");
            System.out.println("1. Gelir Ekle");
            System.out.println("2. Gider Ekle");
            System.out.println("3. Özet Göster");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            
            int secim = scanner.nextInt();
            scanner.nextLine();//burada olan hatayı engellemek için
            if (secim == 1) {
                System.out.print("Gelir miktarı: ");
                double miktar = scanner.nextDouble();
                bakiye += miktar;
                islemler.add("Gelir: +" + miktar + " TL");
                System.out.println("Gelir eklendi!");

            } else if (secim == 2) {
                System.out.print("Gider miktarı: ");
                double miktar = scanner.nextDouble();
                bakiye -= miktar;
                islemler.add("Gider: -" + miktar + " TL");
                System.out.println("Gider kaydedildi!");

            } else if (secim == 3) {
                System.out.println("\n--- İşlem Geçmişi ---");
                for (String islem : islemler) {
                    System.out.println(islem);
                }
                System.out.println("Güncel Bakiye: " + bakiye + " TL");

            } else if (secim == 4) {
                System.out.println("Uygulamadan çıkılıyor. Bol kazançlar!");
                break;
            } else {
                System.out.println("Geçersiz seçim, tekrar dene.");
            }
        }
        scanner.close();
    }
}