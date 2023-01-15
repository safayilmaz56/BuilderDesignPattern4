public abstract class YemekBuilder {

    protected Yemek yemek;

    public Yemek getYemek(){
        return yemek;
    }

    public abstract void setYemekTipi();
    public abstract void setYemekAdi();
    public abstract void setTuz();
}
