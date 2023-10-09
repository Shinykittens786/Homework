// --------- QUESTION 1 -------- //
// Create a function called printFromListEveryNSeconds that will print
// an element from an array list every n seconds until there are no 
// more strings to print.
// Example: Given the list {"I", "am", "not", "very", "smart"} and n = 3,
//  the function should print "I" after 3 seconds, "am" after 6 seconds,
//  "not" after 9 seconds, "very" after 12 seconds and finally "smart"
//  after 15 seconds.
import java.util.*;
class Main {
    static void printFromListEveryNSeconds(ArrayList<String> strList, int n) {
        long current = System.currentTimeMillis(); 
        int i = 0; 
        while (true) {
          if (System.currentTimeMillis() - current >= n * 1000) {
              System.out.println(strList.get(i));          
              current = System.currentTimeMillis(); 
              i += 1; 
            if (i >= strList.size()) {
              break; 
            }
          }
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        ArrayList<String> strList = new ArrayList<String>(); 
        strList.add("I"); 
        strList.add("am"); 
        strList.add("stupid");
        strList.add ("and"); 
        strList.add("my"); 
        strList.add("brain"); 
        strList.add("is"); 
        strList.add("still"); 
        strList.add("growing"); 
        printFromListEveryNSeconds(strList, n);  
    }
}
