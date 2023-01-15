public class Main {
    public static void main(String[] args) {
        YemekBuilder builder = new SuluYemekConcreteBuilder();
        YemekYapici yemekYapici = new YemekYapici();
        yemekYapici.yemekYap(builder);
        System.out.println(builder.yemek.toString());

        System.out.println("/****************************/");

        builder = new EtliYemekConcreteBuilder();
        yemekYapici.yemekYap(builder);
        System.out.println(builder.yemek.toString());
    }
}