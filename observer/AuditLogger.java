package observer;

public class AuditLogger implements PaymentObserver {
    @Override
    public void onPaymentProcessed(double amount, String method) {
        System.out.println("[Audit] Payment of " + amount + " processed using " + method);
    }
}