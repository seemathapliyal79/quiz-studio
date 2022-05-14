import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String > answerOptions;

    public MultipleChoice (String question, String correctAnswer, Integer pointValue){
        super (question,correctAnswer, pointValue );
    }
}
