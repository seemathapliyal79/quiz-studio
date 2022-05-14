import java.util.ArrayList;
import java.util.Objects;

public abstract class Question {
    private String question;
    private String correctAnswer;
    private Integer pointValue;
    private Boolean correct;

    public Question(String question, String correctAnswer, Integer pointValue){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }

    public String askQuestion(){

        return "I asked";
    }

    //take user answer
    public void getUserAnswer(){
    }

    //grade question
    public String gradeQuestions(){
        return "I graded your question";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question) && Objects.equals(correctAnswer, question1.correctAnswer) && Objects.equals(pointValue, question1.pointValue) && Objects.equals(correct, question1.correct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, correctAnswer, pointValue, correct);
    }
}
