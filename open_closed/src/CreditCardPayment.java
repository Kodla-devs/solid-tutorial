public class CreditCardPayment implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("odeme kredi karti ile yapildi: " + amount);
    }
    
}
