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
/*import java.util.*; 
import java.util.function.Supplier; 
<<<<<<< HEAD
/*class GhettoChatBot {
    
=======
class GhettoChatBot {

>>>>>>> e02025a39bbd3238ceaf63b976ac281590b5dfbb
    private List <String> mQuestions; 
    private List <String> mAnswers; 

    public GhettoChatBot() {
        mQuestions = new ArrayList <String>(); 
        mAnswers = new ArrayList <String>(); 
    }

    public GhettoChatBot(List <String> questions, List <String> answers ) {
        this();
<<<<<<< HEAD
        
=======

>>>>>>> e02025a39bbd3238ceaf63b976ac281590b5dfbb
        for (String s : questions) {
            mQuestions.add(s);
        }

        for (String s : answers) {
            mAnswers.add(s);
        }
    }

    public GhettoChatBot(String[] questions, String[] answers) {
        this();
<<<<<<< HEAD
        
=======

>>>>>>> e02025a39bbd3238ceaf63b976ac281590b5dfbb
        for (String s : questions) {
            mQuestions.add(s);
        }

        for (String s : answers) {
            mAnswers.add(s);
        }
    }

    public void addQuestionAndAnswer(String question, String answer) {
        mQuestions.add(question); 
        mAnswers.add(answer); 
    }

    public String askQuestion(String question) {
        for (int i = 0; i < mQuestions.size(); i += 1) {
            if (question == mQuestions.get(i)) {
                return mAnswers.get(i); 
            }
        }
        return("Sorry, I can't answer that question! It is beyond my ability as a very basic AI machine.");
    } 
}
*/