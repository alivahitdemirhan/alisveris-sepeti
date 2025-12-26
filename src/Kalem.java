public class Kalem extends Malzeme
        implements EtiketFiyatiHesapla, ToplamParaHesapla, IndirimHesapla {

    public Kalem(int adet) {
        super(
                UrunBilgileri.KALEM_ISIM,
                UrunBilgileri.KALEM_FIYAT,
                adet
        );
    }

    public double indirimOrani() {
        return UrunBilgileri.KALEM_INDIRIM;
    }

    public double etiketFiyati() {
        return birimFiyat * (1 - indirimOrani());
    }

    public double toplamPara() {
        return etiketFiyati() * adet;
    }
}
