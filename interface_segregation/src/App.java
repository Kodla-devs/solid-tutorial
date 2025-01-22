public class App {
    public static void main(String[] args) throws Exception {

        OrderTaking waiter = new Waiter();
        waiter.takeOrder();

        OrderPreparation chef = new Chef();
        chef.prepareOrder();

        PaymentProcessing cashier = new Cashier();
        cashier.processPayment();

    }
}
