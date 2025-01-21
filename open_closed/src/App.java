public class App {
    public static void main(String[] args) throws Exception {
        PaymentProcessor processor1 = new PaymentProcessor(new CreditCardPayment());
        processor1.process(50);

        PaymentProcessor processor2 = new PaymentProcessor(new PayPalPayment());
        processor2.process(40);

        PaymentProcessor processor3 = new PaymentProcessor(new CryptoPayment());
        processor3.process(30);

        PaymentProcessor processor4 = new PaymentProcessor(new HavalePayment());
        processor4.process(60);
    }
}
