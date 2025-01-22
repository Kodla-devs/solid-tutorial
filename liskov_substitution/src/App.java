public class App {
    public static void main(String[] args) throws Exception {
        BenzinliAraba benzinli2 = new BenzinliAraba();
        ElektrikliAraba elektrikli2 = new ElektrikliAraba();

        benzinli2.calistir();
        benzinli2.benzinAl();

        elektrikli2.calistir();
        elektrikli2.sarjEt();

        System.out.println("\n");


        BenzinliArabaHatali benzinli1 = new BenzinliArabaHatali();
        ElektrikliArabaHatali elektrikli1 = new ElektrikliArabaHatali();

        testArac(benzinli1);
        System.out.println("--------------------");
        testArac(elektrikli1);

    }

    private static void testArac(AracHatali arac) {
        arac.calistir();
        // arac.benzinAl();
        if (arac instanceof ElektrikliArabaHatali) {
            System.out.println("Bu araç elektriklidir, benzin alamaz.");
        } else {
            arac.benzinAl();
        }
    }
}
