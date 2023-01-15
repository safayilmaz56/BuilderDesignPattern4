public class EtliYemekConcreteBuilder extends YemekBuilder{

    public EtliYemekConcreteBuilder() {
        yemek  =new Yemek();
    }

    @Override
    public void setYemekTipi() {
        yemek.yemekTipi = YemekTipi.Etli;
    }

    @Override
    public void setYemekAdi() {
        yemek.yemekAdi = "Etli Pilav";
    }

    @Override
    public void setTuz() {
        yemek.tuz = 65;
    }
}
