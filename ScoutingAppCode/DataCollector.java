import java.io.File; 
import java.io.FileWriter;   
import java.io.IOException; 
import java.util.Scanner; 


public class DataCollector {
    public static void main(String[] args) {
        try {
            Scanner scout = new Scanner(System.in);
            System.out.println("Would you like to create a new file, or add to an old one? Please enter 1 for a new file, and 2 to add to the older file"); 
            String filedetermine = scout.nextLine(); 
            if (filedetermine.equals("2")) {
                FileWriter scouter = new FileWriter("scoutingData.csv", true); 
            // Takes user input and puts it into .csv
                for (;;) {
                    System.out.println("Enter team name"); 
                    String name = scout.nextLine(); 
                    scouter.write(name); 
                    scouter.write(",");

                    System.out.println("Enter the number of notes scored:"); 
                    String number = scout.nextLine(); 
                    scouter.write(number); 
                    scouter.write(",");

                    System.out.println("Does this team do trap or climb?"); 
                    String trapClimb = scout.nextLine(); 
                    scouter.write(trapClimb); 
                    scouter.write(",");

                    System.out.println("What kind of drivetrain does this team have?"); 
                    String drivetrain = scout.nextLine(); 
                    scouter.write(drivetrain);
                    scouter.write(",");

                    System.out.println("Does this team have an auto or a park?"); 
                    String autoPark = scout.nextLine(); 
                    scouter.write(autoPark); 
                    scouter.write(",");

                    System.out.println("How many cycles did this team make?"); 
                    String cycles = scout.nextLine(); 
                    scouter.write(cycles); 
                    scouter.write("\n");
                    
                    System.out.println("All done! Would you like to write another file? Please answer yes or no"); 
                    String answer = scout.nextLine(); 
                    if (answer.equals("no") || answer.equals("NO") || answer.equals("No")) { // nO 
                        scouter.close(); 
                        return; 
                    } // if 9
                }// for
            } // if 
                else if (filedetermine.equals("1")) {
                    File mee = new File("scoutingDat.csv");
                    System.out.println("File created!" + mee.getName());
                    // Write header of CSV file.
                    FileWriter chicken = new FileWriter("scoutingDat.csv"); 
                    System.out.println("Chickenwriter created!"); 
                    final String NAME_HEADER = "Name of team";
                    final String NUMBER_NOTES_HEADER = "Number of notes scored"; 
                    final String SPEAKER_AMP_HEADER = "Speaker or Amp?"; 
                    final String TRAP_CLIMB_HEADER = "Trap or Climb?"; 
                    final String DRIVETRAIN_HEADER = "Type of drivetrain?"; 
                    final String AUTO_HEADER = "Auto and/or Park"; 
                    final String CYCLE_HEADER = "Number of cycles"; 
                    chicken.write(NAME_HEADER);
                    chicken.write(","); 
                    System.out.println("Chicken wrote!");
                    chicken.write(NUMBER_NOTES_HEADER);
                    chicken.write(",");
                    System.out.println("Chicken wrote!");
                    chicken.write(SPEAKER_AMP_HEADER); 
                    chicken.write(","); 
                    System.out.println("Chicken wrote!");
                    chicken.write(TRAP_CLIMB_HEADER); 
                    chicken.write(","); 
                    System.out.println("Chicken wrote!");
                    chicken.write(DRIVETRAIN_HEADER);
                    chicken.write(","); 
                    System.out.println("Chicken wrote!");
                    chicken.write(AUTO_HEADER);
                    chicken.write(",");  
                    System.out.println("Chicken wrote!");
                    chicken.write(CYCLE_HEADER); 
                    chicken.write("\n");
                    System.out.println("Chicken wrote!");
                    for (;;) {
                        System.out.println("Enter team name"); 
                        String name = scout.nextLine(); 
                        chicken.write(name); 
                        chicken.write(",");
                        System.out.println("Chicken wrote!");
    
                        System.out.println("Enter the number of notes scored:"); 
                        String number = scout.nextLine(); 
                        chicken.write(number); 
                        chicken.write(",");
                        System.out.println("Chicken wrote!");
    
                        System.out.println("Does this team do trap or climb?"); 
                        String trapClimb = scout.nextLine(); 
                        chicken.write(trapClimb); 
                        chicken.write(",");
                        System.out.println("Chicken wrote!");
    
                        System.out.println("What kind of drivetrain does this team have?"); 
                        String drivetrain = scout.nextLine(); 
                        chicken.write(drivetrain);
                        chicken.write(",");
                        System.out.println("Chicken wrote!");
    
                        System.out.println("Does this team have an auto or a park?"); 
                        String autoPark = scout.nextLine(); 
                        chicken.write(autoPark); 
                        chicken.write(",");
                        System.out.println("Chicken wrote!");
    
                        System.out.println("How many cycles did this team make?"); 
                        String cycles = scout.nextLine(); 
                        chicken.write(cycles); 
                        chicken.write("\n");
                        System.out.println("Chicken wrote!");
                        
                        System.out.println("All done! Would you like to write another file? Please answer yes or no"); 
                        String answer = scout.nextLine(); 
                        if (answer.equals("no") || answer.equals("NO") || answer.equals("No")) {
                            chicken.close(); 
                            return; 
                        } // if 
                    }// for
                }
        } // try 
        catch (IOException e) {
            System.out.println("An error occurred. ");
            e.printStackTrace(); 
        } // catch
    } // main
} // Reader 