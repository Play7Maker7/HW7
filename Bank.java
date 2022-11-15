public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withDraw(double X)
    {
        balance+=X;
    }
    public void deposit(double X)
    {
        balance-=X;
    }
    public double queryTheBalance()
    {
        return balance;
    }
}
