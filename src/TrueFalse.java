import java.util.ArrayList;

public class TrueFalse extends Question{

    private ArrayList<String > answerOptions;

    public TrueFalse (String question, String correctAnswer, ArrayList<String> answerOptions, Integer pointValue){
        super (question,correctAnswer, pointValue );
        this.answerOptions = answerOptions;
    }

}
