public class WaiterWrong implements RestaurantTasksWrong{

    @Override
    public void takeOrder() {
        System.out.println("Müşteriden sipariş alındı.");
    }

    @Override
    public void prepareOrder() {
        throw new UnsupportedOperationException("Garson yemek hazırlayamaz.");
    }

    @Override
    public void processPayment() {
        throw new UnsupportedOperationException("Garson odeme alamaz.");
    }
    
}
