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

    public GhettoChatBot() {
        ArrayList <String> questions = new ArrayList <String>(); 
        ArrayList <String> answers = new ArrayList <String>(); 
    }

    public GhettoChatBot(List <String> questions, List <String> answers ) {
        questions.add("Do you know the song Double, Double, Toil and Trouble?");
        questions.add("What is your name?"); 
        questions.add("What are you?"); 
        questions.add("What do you eat?"); 
        questions.add("Do you sleep?");
        questions.add("Why are you so dumb and limited?"); 
        answers.add("Yes I do! I will build a program to synchronize the lyrics to a song later on *cough cough question 3*"); 
        answers.add("Hey! I'm Albus :)"); 
        answers.add("I'm a program designed by the wizards to fool ismple muggle minds with the mere powers of AI and machine learning. I'm really just a simple program."); 
        answers.add("I dine on electricity, bytecode, and tasty morsels of Bertie Bott's every flavour beans. I love their motor oil flavouring :D"); 
        answers.add("I am a program, so no, I do not sleep."); 
        answers.add(">:( I am not dumb, nor limited. Me thinks you are a muggle.");
        
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
