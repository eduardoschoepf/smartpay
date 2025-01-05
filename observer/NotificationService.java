package observer;

public class NotificationService implements PaymentObserver {
    @Override
    public void onPaymentProcessed(double amount, String method) {
        System.out.println("[Notification] User notified about payment of " + amount + " via " + method);
    }
}
