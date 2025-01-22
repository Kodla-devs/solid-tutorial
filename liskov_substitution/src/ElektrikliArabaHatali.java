public class ElektrikliArabaHatali extends AracHatali{

    
    @Override
    public void calistir() {
        System.out.println("Elektrikli araba çalıştırılıyor.");
    }
    
    @Override
    public void benzinAl() {
        throw new UnsupportedOperationException("Elektrikli araba benzin alamaz.");
    }
}
