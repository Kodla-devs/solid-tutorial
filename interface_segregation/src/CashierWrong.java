public class CashierWrong implements RestaurantTasksWrong{

    @Override
    public void takeOrder() {
        throw new UnsupportedOperationException("Kasiyer sipariş alamaz.");
    }

    @Override
    public void prepareOrder() {
        throw new UnsupportedOperationException("Kasiyer yemek hazırlayamaz.");
    }

    @Override
    public void processPayment() {
        System.out.println("Ödeme alındı.");
    }
    
}
