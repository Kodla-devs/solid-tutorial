public class ElektrikliAraba extends Arac implements Elektrikli{

    @Override
    public void sarjEt() {
        System.out.println("Elektrikli araba sarj ediliyor.");
    }

    @Override
    public void calistir() {
        System.out.println("Elektrikli araba çalıştırılıyor.");
    }
    
}
