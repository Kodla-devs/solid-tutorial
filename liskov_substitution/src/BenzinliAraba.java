public class BenzinliAraba extends Arac implements Benzinli{

    @Override
    public void benzinAl() {
        System.out.println("Benzinli araba benzin alıyor.");
    }

    @Override
    public void calistir() {
        System.out.println("Benzinli araba çalıştırılıyor.");
    }
    
}
