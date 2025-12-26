import java.util.ArrayList;
import java.util.List;

public class Sepet {

    private List<Malzeme> urunler = new ArrayList<>();

    public void urunEkle(Malzeme m) {
        urunler.add(m);
        System.out.println(m.getIsim() + " sepete eklendi.");
    }

    public void urunSilAdet(String isim, int silinecekAdet) {

        for (Malzeme m : urunler) {

            if (m.getIsim().equalsIgnoreCase(isim)) {

                if (silinecekAdet >= m.adet) {
                    urunler.remove(m);
                    System.out.println(isim + " tamamen silindi.");
                } else {
                    m.adet -= silinecekAdet;
                    System.out.println(silinecekAdet + " adet " + isim + " silindi.");
                }
                return;
            }
        }
        System.out.println("Ürün bulunamadı.");
    }

    public void sepetiListele() {

        if (urunler.isEmpty()) {
            System.out.println("Sepet boş.");
            return;
        }

        System.out.println("------ SEPET ------");
        for (Malzeme m : urunler) {
            m.bilgileriYazdir();
            System.out.println("Etiket Fiyatı: " +
                    ((EtiketFiyatiHesapla) m).etiketFiyati());
            System.out.println("Toplam: " +
                    ((ToplamParaHesapla) m).toplamPara());
            System.out.println("-------------------");
        }
    }

    public double genelToplam() {
        double toplam = 0;
        for (Malzeme m : urunler) {
            toplam += ((ToplamParaHesapla) m).toplamPara();
        }
        return toplam;
    }
}
