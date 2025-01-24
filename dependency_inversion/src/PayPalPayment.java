public class PayPalPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("PayPal ile ödeme yapıldı: " + amount + " TL");
    }
    
}
