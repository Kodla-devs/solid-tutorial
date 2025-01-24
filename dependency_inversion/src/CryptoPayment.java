public class CryptoPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Kripto ile ödeme yapıldı: " + amount + " TL");
    }
    
}
