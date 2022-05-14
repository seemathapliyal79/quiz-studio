import java.util.ArrayList;

public class QuizRunner {

    public static void main (String[] args){
        ArrayList<String> option = new ArrayList<>();
        option.add("yes");
        option.add("no");
        TrueFalse question1 = new TrueFalse("Are you human?", "Yes",option, 1 );
        System.out.println(question1.askQuestion());
        System.out.println(question1.gradeQuestions());

    }
}
