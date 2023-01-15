public class Yemek { //product
    public YemekTipi yemekTipi;
    public String yemekAdi;
    public double tuz;

    public YemekTipi getYemekTipi() {
        return yemekTipi;
    }

    public void setYemekTipi(YemekTipi yemekTipi) {
        this.yemekTipi = yemekTipi;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }

    public void setYemekAdi(String yemekAdi) {
        this.yemekAdi = yemekAdi;
    }

    public double getTuz() {
        return tuz;
    }

    public void setTuz(double tuz) {
        this.tuz = tuz;
    }

    @Override
    public String toString() {
        return getYemekTipi() + " Tuz oranı : " + getTuz();
    }
}
