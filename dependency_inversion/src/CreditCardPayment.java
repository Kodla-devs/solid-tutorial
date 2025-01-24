public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Kredi kartı ile ödeme yapıldı: " + amount + " TL");
    }
    
}
