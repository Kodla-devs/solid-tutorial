public class HavalePayment implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("odeme havale ile yapildi: " + amount);
    }
    
}
