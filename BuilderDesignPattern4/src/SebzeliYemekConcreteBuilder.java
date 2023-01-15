public class SebzeliYemekConcreteBuilder extends YemekBuilder{

    public SebzeliYemekConcreteBuilder() {
        yemek = new Yemek();
    }

    @Override
    public void setYemekTipi() {
        yemek.yemekTipi = YemekTipi.Sebzeli;
    }

    @Override
    public void setYemekAdi() {
        yemek.yemekAdi =  "Pırasa";
    }

    @Override
    public void setTuz() {
        yemek.tuz = 15;
    }
}
