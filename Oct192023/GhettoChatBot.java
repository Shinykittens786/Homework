/*// ---------- QUESTION 2 -----------
Make a class called GhettoChatBot.
There should be three constructors. 
   The first is the default constructor that takes no paramters. 
   The second takes in two lists of strings, where the first is a list of questions and the other is the list of corresponding answers.
   The third takes in two arrays of strings, where the first is an array of questions and the other is an array of the corresponding answers.
The following public methods should be implemented:
   void addQuestionAndAnswer(String question, String answer) -> Adds a new question that the GhettoChatBot can answer.
   String askQuestion(String question) -> If the GhettoChatBot can answer the question, it does. If not, it says "Sorry, I do not understand the question."
When you've implemented the method, make an interactive program out of GhettoChatBot. Be creative.*/
import java.util.*; 
import java.util.function.Supplier; 
class GhettoChatBot {

    private List <String> xQuestions;
    private List <String> xAnswers;
   // private String[] yQuestions;
    //private String[] yAnswers;

    public GhettoChatBot() {

    }

    public GhettoChatBot(List <String> questions, List <String> answers ) {
        xQuestions = questions;
        xAnswers = answers;
    }

    //public GhettoChatBot(String[] yquestions, String[] yanswers) {
      //  yQuestions = yquestions;
        //yAnswers = yanswers;
    //}

    public void addQuestionAndAnswer(String question, String answer) {
        xQuestions.add(question); 
        xAnswers.add(answer); 
    }

    public String askQuestion(String question) {
        for (int i = 0; i < xQuestions.size(); i += 1) {
            if (question == xQuestions.get(i)) {
                return xAnswers.get(i); 
            }
        }
        return("Sorry, I can't answer that question! It is beyond my ability as a very basic AI machine.");
    } 
}
