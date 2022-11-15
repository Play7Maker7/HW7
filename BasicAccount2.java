public class BasicAccount2 extends Bank{

    public BasicAccount2(double balance) {
        super(balance);
    }
    private double accountBalance=super.queryTheBalance();
    public void withDraw(double X)
    {
        if (X>=accountBalance) accountBalance-=(X+30);
    }
}
