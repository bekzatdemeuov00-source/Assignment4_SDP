package Facade;

class PaymentService {

    private int balance;

    public PaymentService(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Баланс не может быть отрицательным"
            );
        }

        this.balance = balance;
    }

    public void pay(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Сумма оплаты должна быть положительной"
            );
        }

        if (balance < amount) {
            throw new IllegalStateException("Недостаточно средств");
        }

        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
