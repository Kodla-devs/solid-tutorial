public class Waiter implements OrderTaking{

    @Override
    public void takeOrder() {
        System.out.println("Müşteriden sipariş alındı.");
    }
    
}
