public class TestKitabi extends Malzeme
        implements EtiketFiyatiHesapla, ToplamParaHesapla, IndirimHesapla {

    public TestKitabi(int adet) {
        super(
                UrunBilgileri.TEST_KITABI_ISIM,
                UrunBilgileri.TEST_KITABI_FIYAT,
                adet
        );
    }

    public double indirimOrani() {
        return UrunBilgileri.TEST_KITABI_INDIRIM;
    }

    public double etiketFiyati() {
        return birimFiyat * (1 - indirimOrani());
    }

    public double toplamPara() {
        return etiketFiyati() * adet;
    }
}
