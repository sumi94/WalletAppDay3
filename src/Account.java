public class Account {
    private double balance;

    public Account(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "" + balance;
    }

    public void addMoney(double money) {
        balance = balance +  money>0 ? money : 0;
    }

    public void getMoney(double money) {
        balance -= (money > 0)? (money) : 0;


    }
}
