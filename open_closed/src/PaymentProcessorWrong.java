public class PaymentProcessorWrong {
    public void processPayment(String method, double amount) {
        if(method.equals("CreditCard")) {
            System.out.println("odeme kredi karti ile yapildi: " + amount);
        } else if(method.equals("PayPal")){
            System.out.println("odeme paypayl ile yapildi: " + amount);
        } else  if (method.equals("Crypto")) {
            System.out.println("odeme crypto ile yapildi: " + amount);
        } else if (method.equals("Havale")) {
            System.out.println("odeme havale ile yapildi: " + amount);
        }
    }
    
}
