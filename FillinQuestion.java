public class FillinQuestion extends Question{

    private String QnA;

    public FillinQuestion(String t, String a) {
        super("__"+t, a+"__");
        QnA=t+"__"+a;
    }
    public String display()
    {
        return QnA;
    }
}
