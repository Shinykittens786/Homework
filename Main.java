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
        for (int i = 0; i < strList.size(); i += 1) {
            if (System.currentTimeMillis() - current >= n * 1000) {
            System.out.println(strList.get(i) + " ");
            current = System.currentTimeMillis(); 
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        ArrayList<String> strList = new ArrayList<String>(); 
        strList.add("I"); 
        strList.add("am"); 
        strList.add("stupid"); 
        printFromListEveryNSeconds(strList, n);  
    }
    
}
