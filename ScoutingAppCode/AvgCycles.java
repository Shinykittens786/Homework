import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.HashMap;
// What do we want our code to do? How?
// 1. Find the average of the cycles for each team
//  - Create a class or function that reads through the file, collecting each line as a list 
//  - Take each list and identify if they have the same team number (index 0)
//  - if they have the same team number, take the 5th indexes and add them together, and divide by the number of indexes (have this increase from 0 for every matching list found i guess)

// Steps:
// 1 - Read through the lines of the file:
//      - What are we interested in picking ou
public class AvgCycles {
    private static List<List<String>> readLinesFromFile(String fileName) {
        List<List<String>> file = new ArrayList<>();
        List<String> fileLine = new ArrayList<>(); 
        String line; 
        String delimiter = ","; 
        try {
            File scoutFile = new File("scoutingData.csv"); 
            Scanner readFile = new Scanner(scoutFile); 
            while (readFile.hasNextLine()) {
                line = readFile.nextLine();
                fileLine = Arrays.asList(line.split(delimiter)); 
                file.add(fileLine);
            } // while
            System.out.println(file);
            return file;
        } // try 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } // catch
        return file;
    } // readLinesFromFile
        
    private static List<List<String>> getTeamAndNumOfCyclesPairsFromMatchData(List<List<String>> file) {
        String tempTeamNum;
        String tempCycle; 
        List<List<String>> teamNums = new ArrayList<>();
        //List<String> cycles = new ArrayList<>();
        List<List<String>> fileLines = readLinesFromFile("scoutingData.csv"); 
        for (int i = 1; i < fileLines.size(); i += 1) { // maybe make this i = 1 later, to avoid the first line of the file
            for (int j = 0; j < 6; j += 1) {
                if (j == 1) {
                    teamNums.add(fileLines.get(i));
                } // if
                if (j == 5) {
                    teamNums.add(fileLines.get(i)); 
                } // if
            } // for
        } // for
        return teamNums;
    } // getTeamAndNumOfCyclePairsFromMatchData

    private static List<String> getTeamNums(List<List<String>> teamNums) {
        List<String> teams = new ArrayList<>(); 
        for (int i = 1; i < teamNums.size(); i += 1) {
            teams.add(teamNums.get(i).get(0)); 
        } // for
        return teams; 
    } // getTeamNums

    private static Double getAverageOfRequestedTeam(String teamNumber, List<List<String>> teamNums) {
        int count = 0; 
        int avg = 0; 
        for (int i = 0; i < teamNums.size(); i += 1) {
            if (teamNums.get(i).get(0).equals(teamNumber)) {
                avg += Integer.valueOf(teamNums.get(i).get(1)); 
                count += 1; 
            } // if
        } // for
        double fina = avg / count; 
        return fina; 
    } // getAvgOfRequestedTeam

//   private static Double getRankOfATeam(String teamNumber, List<List<String>> teamNums) {
//         Map<String, Double> getRank = new HashMap<>(); 
//         for (int i = 0; i < teamNums.size(); i += 1) {
//             if (teamNums.get(i).get(0).equals(teamNumber)) {
//                 double avg = getAverageOfRequestedTeam(teamNums.get(i).get(0), teamNums); 
//                 getRank.put(teamNums.get(i).get(0), avg); 
//             }
//         }
//         return(getRank.get(teamNumber)); 
//     } // Don't know if this works. Didn't have time to check. 


    /*private Map<String, Double> rankMap (String filename) {
        Map<String, Double> rankedTeamsCycles = new HashMap<>(); 
        List<List<String>> file = readLinesFromFile(filename); 
        List<List<String>> numbers = getTeamAndNumOfCyclesPairsFromMatchData(file); 
        List<String> teams = getTeamNums(numbers); 
            for (int i = 0; i < numbers.size(); i += 1) {
                //(List<List<String>> num : numbers)
                Double d = getAverageOfRequestedTeam(teams.get(i), numbers);
                rankedTeamsCycles.put(teams.get(i), d); 
                System.out.println(rankedTeamsCycles);
            } // for 
        return rankedTeamsCycles; 
    } // rankMap*/

    public /*Map<String, Double>*/ Double getAvgCycles(String filename, String userinput) {
	// Assuming the helper functions work, chain them together below:
        // The key to programming is ABSTRACTION
        // The key to all of computer science and really a lot of engineering is ABSTRACTION
        List<List<String>> file = readLinesFromFile(filename); 
        List<List<String>> numbers = getTeamAndNumOfCyclesPairsFromMatchData(file); 
        Double pairs = getAverageOfRequestedTeam(userinput, numbers);
        return pairs; 
    } // getAvgCycles

    // public Double rankATeam(String filename, String userinput) {
    //     List<List<String>> file = readLinesFromFile(filename); 
    //     List<List<String>> numbers = getTeamAndNumOfCyclesPairsFromMatchData(file); 
    //     Double rank = getRankOfATeam(userinput, numbers); 
    //     return rank; 
    // }

}
