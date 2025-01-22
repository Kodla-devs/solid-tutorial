public class ChefWrong implements RestaurantTasksWrong{

    @Override
    public void takeOrder() {
        throw new UnsupportedOperationException("Aşçı sipariş alamaz.");
    }

    @Override
    public void prepareOrder() {
        System.out.println("Yemek hazırlanıyor");
    }

    @Override
    public void processPayment() {
        throw new UnsupportedOperationException("Aşçı ödeme alamaz.");
    }
    
}
