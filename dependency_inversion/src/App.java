public class App {
    public static void main(String[] args) throws Exception {
        PaymentService creditCardPaymentService = new PaymentService(new CreditCardPayment());
        creditCardPaymentService.processPayment(400);

        PaymentService paypalPaymentService = new PaymentService( new PayPalPayment());
        paypalPaymentService.processPayment(300);

        PaymentService cryptoPaymentService = new PaymentService( new CryptoPayment());
        cryptoPaymentService.processPayment(500);
    }
}
