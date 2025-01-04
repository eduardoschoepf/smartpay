package context;

import java.util.ArrayList;
import java.util.List;

import strategy.PaymentStrategy;

public class PaymentContext {
    private static PaymentContext instance;
    private PaymentStrategy paymentStrategy;

    private PaymentContext() {}

    public static PaymentContext getInstance() {
        if (instance == null) {
            instance = new PaymentContext();
        }
        return instance;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set");
        }
        paymentStrategy.pay(amount);
    }
}
