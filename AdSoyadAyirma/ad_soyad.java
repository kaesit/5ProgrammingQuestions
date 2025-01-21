

public class ad_soyad {
    public static void main(String[] args) {
        String adSoyad = "Ahmet Erdal Kulak";  // Ad ve soyad içeren string

        // Ad ve soyad bilgilerini boşluk karakteriyle ayırıyoruz
        String[] adSoyadArray = adSoyad.split(" ");  // Boşluk karakterine göre ayırma

        // Ad dizisini oluşturuyoruz (ilk kelimeyi alıyoruz)
        String[] ad = new String[adSoyadArray.length - 1];
        System.arraycopy(adSoyadArray, 0, ad, 0, adSoyadArray.length - 1);

        // Soyadı son eleman olarak kabul ediyoruz
        String soyad = adSoyadArray[adSoyadArray.length - 1];

        // Konsola ad ve soyad bilgilerini yazdırıyoruz
        System.out.print("Ad: ");
        for (String a : ad) {
            System.out.print(a + " ");  // Adları yazdırıyoruz
        }
        System.out.println("\nSoyad: " + soyad);
        String adSoyad2 = "Ahmet Kulak";  // Ad ve soyad içeren string

        // Ad ve soyad bilgilerini boşluk karakteriyle ayırıyoruz
        String[] adSoyadArray2 = adSoyad2.split(" ");  // Boşluk karakterine göre ayırma

        // Ad ve soyad dizilerine kaydediyoruz
        String[] ad2 = {adSoyadArray2[0]};  // İlk eleman adı temsil eder
        String[] soyad2 = {adSoyadArray2[1]};  // İkinci eleman soyadı temsil eder

        // Konsola ad ve soyad bilgilerini yazdırıyoruz
        System.out.println("Ad: " + ad2[0]);
        System.out.println("Soyad: " + soyad2[0]);
    }
}
