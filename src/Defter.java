public class Defter extends Malzeme
        implements EtiketFiyatiHesapla, ToplamParaHesapla {

    public Defter(int adet) {
        super(
                UrunBilgileri.DEFTER_ISIM,
                UrunBilgileri.DEFTER_FIYAT,
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
