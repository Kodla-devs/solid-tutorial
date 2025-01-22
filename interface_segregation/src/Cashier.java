public class Cashier implements PaymentProcessing{

    @Override
    public void processPayment() {
        System.out.println("Ödeme alındı.");
    }
    
}
