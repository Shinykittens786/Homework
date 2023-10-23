/*import java.util.ArrayList; 
import java.util.*;
class Main {
  static List<Double> rangeList(double start, double stop, double stepSize) {
    ArrayList<Double> list = new ArrayList<Double>();
    if (start == stop) {
      return list; 
    }
    
    if (stepSize < 0 && stop > start) {
      return list; 
    }

    if (stepSize > 0 && start > stop) {
      return list; 
    }
    
    list.add(start);
    if (stepSize < 0) {
      for (int i = 1;; i += 1) {
        list.add(start += stepSize); 
        if (list.get(i) == stop) {
          break;
        }
      }
    }
    
    if (stepSize > 0) {
    for (int i = 1;; i += 1) {
      if (list.get(i) <= stop) {
        break;
      } else {
        list.add(start += stepSize); {
      }
    }
    }
}
    return list;
  }



  public static void main(String[] args) {
    System.out.println(rangeList(4.0, 4.0, -1.0));
  }
}*/

import java.util.*; 
import java.util.function.Supplier; 
class Main {
    public static void main(String[] args) {
        ArrayList <String> questions = new ArrayList <String>(); 
        ArrayList <String> answers = new ArrayList <String>(); 
      
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
        
      

      GhettoChatBot Albus = new GhettoChatBot(questions, answers);
        System.out.println(Albus.askQuestion("What is your name?")); 
        System.out.println(Albus.askQuestion("What do you eat?"));
        System.out.println(Albus.askQuestion("What are you?")); 
        System.out.println(Albus.askQuestion("Do you know the song Double, Double, Toil and Trouble?"));
        System.out.println(Albus.askQuestion("Are you on a robotics team?"));
        Albus.addQuestionAndAnswer("Are you on a robotics team?", "No I am not, but I am quite fond of 4343 as a team.");
        System.out.println(Albus.askQuestion("Are you on a robotics team?")); 
    }
}