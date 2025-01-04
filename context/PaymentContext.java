package context;

import java.util.ArrayList;
import java.util.List;

import observer.PaymentObserver;
import strategy.PaymentStrategy;

public class PaymentContext {
    private static PaymentContext instance;
    private PaymentStrategy paymentStrategy;
    private List<PaymentObserver> observers = new ArrayList<>();

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

    public void addObserver(PaymentObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PaymentObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(double amount, String method) {
        for (PaymentObserver observer : observers) {
            observer.onPaymentProcessed(amount, method);
        }
    }
}
