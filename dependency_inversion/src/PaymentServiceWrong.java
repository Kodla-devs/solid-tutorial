public class PaymentServiceWrong {
    private CreditCardPaymentWrong creditCardPaymentWrong = new CreditCardPaymentWrong();
    private PayPalPaymentWrong payPalPaymentWrong = new PayPalPaymentWrong();
    private CryptoPaymentWrong cryptoPaymentWrong = new CryptoPaymentWrong();

    public void processPayment(double amount, String method) {
        // creditCardPaymentWrong.pay(amount);
        if (method.equalsIgnoreCase("creditcard")) {
            creditCardPaymentWrong.pay(amount);
        } else if (method.equalsIgnoreCase("paypal")) {
            payPalPaymentWrong.pay(amount);
        } else if (method.equalsIgnoreCase("crypto")) {
            cryptoPaymentWrong.pay(amount);
        } else {
            throw new IllegalArgumentException("Geçersiz ödeme yöntemi.");
        }
    }
}
