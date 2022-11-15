public class BasicAccount extends Bank{

    public BasicAccount(double balance) {
        super(balance);
    }
    private double accountBalance=super.queryTheBalance();
    public void withDraw(double X)
    {
        if (X>=accountBalance) accountBalance=0;
    }
}
