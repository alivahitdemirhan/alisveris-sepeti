public class Silgi extends Malzeme
        implements EtiketFiyatiHesapla, ToplamParaHesapla {

    public Silgi(int adet) {
        super(
                UrunBilgileri.SILGI_ISIM,
                UrunBilgileri.SILGI_FIYAT,
                adet
        );
    }

    public double etiketFiyati() {
        return birimFiyat;
    }

    public double toplamPara() {
        return birimFiyat * adet;
    }
}
