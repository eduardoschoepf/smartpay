package observer;

public interface PaymentObserver {
    void onPaymentProcessed(double amount, String method);
}
