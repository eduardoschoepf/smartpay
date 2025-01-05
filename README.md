# Payment System with Design Patterns  

A modular and scalable payment management system using multiple **Design Patterns**. This project demonstrates the power of clean architecture and reusable code through the following patterns:  

- **Singleton Pattern**  
- **Strategy Pattern**  
- **Factory Pattern**  
- **Observer Pattern**  

---

## Features  

1. **Dynamic Payment Strategies**:  
   - Switch between different payment methods (Credit Card, PayPal, Pix) at runtime.  

2. **Centralized Context Management**:  
   - A single `PaymentContext` instance controls the workflow and ensures consistency.  

3. **Notification System**:  
   - Observers are automatically notified of payment events (e.g., logging, notifications).  

4. **Factory for Payment Strategies**:  
   - Strategies are created using a factory, making it easy to add new payment methods.  

---

## Design Patterns  

### 1. **Singleton Pattern**  
The `PaymentContext` ensures a single instance across the application.  

### 2. **Strategy Pattern**  
Abstracts payment methods using an interface (`PaymentStrategy`) and concrete implementations:  
- `CreditCardPayment`  
- `PayPalPayment`  
- `PixPayment`  

### 3. **Factory Pattern**  
The `PaymentStrategyFactory` creates payment strategies based on the input type.  

### 4. **Observer Pattern**  
The system notifies observers like:  
- `AuditLogger`: Logs payment events.  
- `NotificationService`: Sends notifications about payments.  

---

## Installation  
 Clone this repository:  
   ```bash
   git clone https://github.com/eduardoschoepf/smartpay.git  
   cd smartpay  
   javac .\Main.java  
   java Main  