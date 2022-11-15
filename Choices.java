import java.util.ArrayList;

public class Choices extends Question{
    private String choice;
    public Choices(String t , String a)
    {
        super(t,a);
    }

    @Override
    public String toString() {
        return "Choices{" +
                "choice='" + choice + '\'' +
                '}';
    }

    public void addChoice(String S , boolean b)
    {
        choice = S;
    }
}
