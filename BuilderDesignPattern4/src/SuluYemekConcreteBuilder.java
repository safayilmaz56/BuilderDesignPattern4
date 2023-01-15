public class SuluYemekConcreteBuilder extends YemekBuilder{

    public SuluYemekConcreteBuilder() {
        yemek = new Yemek();
    }

    @Override
    public void setYemekTipi() {
        yemek.yemekTipi =  YemekTipi.Sulu;
    }

    @Override
    public void setYemekAdi() {
        yemek.yemekAdi = "Çorba";
    }

    @Override
    public void setTuz() {
        yemek.tuz = 75;
    }
}
