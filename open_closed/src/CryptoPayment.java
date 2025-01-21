public class CryptoPayment implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("odeme kripto ile yapildi: " + amount);
    }
    
}
