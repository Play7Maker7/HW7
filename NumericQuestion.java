public class NumericQuestion extends Question{

    private int answer;
    public NumericQuestion(String t, String a) {
        super(t, a);
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(int S)
    {
        if (S==answer||(S+0.01)==answer||(S-0.01)==answer)
            return true;
        else return false;
    }
}
