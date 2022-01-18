package OOP;

public class Cuenta {
    public static final double LIMITE_NORMAL = 300.00;

    private double balance;
    private double limit;

    public Cuenta(){ //Constructor sin parámetros
        this.balance = 0;
        this.limit = LIMITE_NORMAL;
    }

    public Cuenta(double limit){ //Constructor con parámetros
        this.balance = 0;
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
