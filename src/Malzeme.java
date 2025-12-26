public abstract class Malzeme {

    protected String isim;
    protected double birimFiyat;
    protected int adet;

    public Malzeme(String isim, double birimFiyat, int adet) {
        this.isim = isim;
        this.birimFiyat = birimFiyat;
        this.adet = adet;
    }

    public void bilgileriYazdir() {
        System.out.println("Ürün: " + isim);
        System.out.println("Birim Fiyat: " + birimFiyat);
        System.out.println("Adet: " + adet);
    }

    public String getIsim() {
        return isim;
    }
}
