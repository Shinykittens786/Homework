/*Write another program that is able to open such a file and based on input in
the format of your choosing is able to display data for each team.
Example of inputs: 
view 5036 - maybe this displays the match data for 5036
rankAllTeams - maybe this ranks all the teams by some metric
rankAllTeams notesScored - maybe this ranks all the teams by the number of notes scored
averages notesScored - maybe this shows the average notes scored for each team*/
import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections;
import java.util.*;

class Extra {
    public static void main (String[] args) {
       Scanner readUser = new Scanner(System.in); 
       System.out.println("Welcome! Which of these functions would you like to use?"); 
       System.out.println("viewTeam --> This will allow you to see all the stats of a team stored in the scoutingData file. Enter 1"); 
       System.out.println("getAvgCycles --> This will give you the average number of cycles for any team u type in. Enter 2"); 
       System.out.println("rankATeam --> This will rank the teams based on the number of cycles. Enter 3"); 
       System.out.println("rankAllTeams notesScored --> This will rank the teams by the number of notes scored. Enter 4"); 
       System.out.println("averages notesScored --> This will show the average notes scored for each team. Enter 5"); 
       String answer = readUser.nextLine(); 
       
        if (answer.equals("viewTeam") || answer.equals("1")) {
            System.out.println("Please enter the team number you would like to check"); 
            String team = readUser.nextLine(); 
            viewTeam(team); 
            readUser.close(); 
            return;
       } if (answer.equals("getAvgCycles") || answer.equals("2")) {
            System.out.println("Please enter the team number you would like to check"); 
            String ans = readUser.nextLine(); 
            AvgCycles chick = new AvgCycles();
            System.out.println(chick.getAvgCycles("scoutingData.csv", ans)); 
            readUser.close(); 
            return; 
        }
    //     if (answer.equals("rankATeam") || answer.equals("3")) {
    //         System.out.println("Please enter the team number you would like to check"); 
    //         String ans2 = readUser.nextLine(); 
    //         AvgCycles chickie = new AvgCycles();
    //         chickie.rankATeam(ans2, "scoutingData.csv");
    //         readUser.close(); 
    //         return;
    //    }
       
       else {
        System.out.println("Oops! That function doesn't exist. Try again!");
        readUser.close(); 
        return; 
       } 
    }
    static void viewTeam(String teamnumber) {
        try {
            File scoutFile = new File("scoutingData.csv"); 
            Scanner readFile = new Scanner(scoutFile); 
            while (readFile.hasNextLine()) {
                String check = readFile.nextLine(); 
                if (check.contains(teamnumber)) {
                System.out.println(check); 
                }
            } readFile.close(); 
        }
            catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
        }
    }
}
 
