import java.util.ArrayList;

public class CheckBox extends Question {

    private ArrayList<String > answerOptions;

    public CheckBox (String question, String correctAnswer, ArrayList<String> answerOptions, Integer pointValue){
        super (question,correctAnswer, pointValue );
        this.answerOptions = answerOptions;
    }
}
