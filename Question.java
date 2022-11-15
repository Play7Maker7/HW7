public class Question {
    private String text;
    private String answer;
    public Question (String t , String a)
    {
        text = t;
        answer = a;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public boolean checkAnswer(String S)
    {
        if (S==answer) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String display()
    {
        return text+"\n"+answer;
    }
}
