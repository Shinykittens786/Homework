import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
public class Main {
    public static void main(String[] args) {
        try {
 // Single integrator: Velocity is the thing driving this system. Let's imagine a robot travelling in a 1D plane.
 // We can control the velocity directly here (using Kp, Ki, and Kd)
            File mee = new File("mathIA.csv");
            FileWriter scouter = new FileWriter("mathIASingleIntegrator.csv");
            final String FINAL_ERROR = "Final Error";
            final String TIME = "Time in Miliseconds";
            final String SUM_OF_INTEGRALS = "Input Acceleration";
            final String DERIVATIVE_CHANGES = "Input Velocity";
            scouter.write(FINAL_ERROR);
            scouter.write(",");
            scouter.write(TIME);
            scouter.write(",");
            scouter.write(SUM_OF_INTEGRALS);
            scouter.write(",");
            scouter.write(DERIVATIVE_CHANGES);
            scouter.write(",");
            scouter.write("\n");
        
            SingleIntegrator singleIntegratorSim = new SingleIntegrator(/* position*/160, /* timestep*/ 0.01); 
                // Geminid-- meteor shower 
                // not meteora the linkin park album‘
            DoubleIntegrator doubleIntegratorSim = new DoubleIntegrator(160, 0, 0.01); 
            double time = 0; 


            // BANG BANG CONTROLLER LOOP 
            /*for (int i = 0; i <= 1000; i += 1) {
                // Getting current position 
                double currentpos = singleIntegratorSim.getCurrentPos(); 
                // Calculate controller input 
                // double inputVelocity = currentpos * -3;
                double inputVelocity = 0; 
                if (currentpos > 0) { 
                    inputVelocity = -570.;
                } else if (currentpos < 0) { 
                    inputVelocity = 400;
                }
                            
                //Simulate plant (system we control)
                singleIntegratorSim.simulate(inputVelocity);

                // Outputting results, and writing to csv file:
                System.out.println(singleIntegratorSim.getCurrentPos()); 
                scouter.write(String.valueOf(currentpos)); 
                time = (i + 1) * 0.01; 
                scouter.write(","); 
                scouter.write(String.valueOf(time)); 
                scouter.write("\n");
            }*/

            // SINGLE INTEGRATOR LOOP - P CONTROLLER 
            // This loop will run 1000 times-- and since the time interval is 0.01 seconds
            // that would suggest this simulation would run for 10 seconds (0.01 * 1000)
            /*for (int i = 0; i <= 1000; i += 1) {
                double currentpos = singleIntegratorSim.getCurrentPos();
                // setting our current position at the beginning of the loop
                double inputVelocity = currentpos * -3; 
                // multiplying by a P constant, -3
                singleIntegratorSim.simulate(inputVelocity);
                // using the previous constant as input for our simulation 

                // Writing to file (csv)
                scouter.write(String.valueOf(currentpos)); 
                time = (i + 1) * 0.01; 
                // recording the time as well 
                scouter.write(","); 
                scouter.write(String.valueOf(time)); 
                scouter.write("\n");
            }*/
            // ERROR LANDED AT 0. PROPORTIONAL VALUE ONLY-- DOUBLE INTEGRATOR SIM
/*             for (int i = 0; i <= 60000; i += 1) {
                double currentDoublePosition = doubleIntegratorSim.getCurrentPos(); 
                double input = currentDoublePosition * -0.001;
                doubleIntegratorSim.simulateVelocityAndPos(doubleIntegratorSim.capAcceleration(input)); 
                scouter.write(String.valueOf(doubleIntegratorSim.getCurrentPos()));
                scouter.write(","); 
                scouter.write(String.valueOf(i * 0.01)); 
                scouter.write(",");
                scouter.write(String.valueOf(input)); 
                scouter.write("\n"); 1

            }
*/
        // OSCILLATING P-- DOUBLE INTEGRATOR
        /*for (int i = 0; i <= 60000; i += 1) {
            double currentDoublePosition = doubleIntegratorSim.getCurrentPos(); 
            double input = currentDoublePosition * -0.09;
            doubleIntegratorSim.simulateVelocityAndPos(doubleIntegratorSim.capAcceleration(input)); 
            scouter.write(String.valueOf(doubleIntegratorSim.getCurrentPos()));
            scouter.write(","); 
            scouter.write(String.valueOf(i * 0.01)); 
            scouter.write(",");
            scouter.write(String.valueOf(input)); 
            scouter.write("\n"); 
        }
*/

/*PIDController derivativeController = new PIDController(-0.09, 0, -48, 0, 160, 0.01);

        // OSCILLATING P CONTROLLER USING PID CLASS (FIXED USING D CONTROLLER, -48)
             for (int i = 0; i <= 60000; i += 1) {
                double currentPosition = doubleIntegratorSim.getCurrentPos(); 
                derivativeController.updateError(currentPosition); 
                doubleIntegratorSim.simulateVelocityAndPos(derivativeController.getOutput());
                scouter.write(String.valueOf(doubleIntegratorSim.getCurrentPos()));
                scouter.write(","); 
                scouter.write(String.valueOf(i * 0.01)); 
                scouter.write(","); 
                scouter.write(String.valueOf(currentPosition)); 
                scouter.write("\n");  
            }
*/

    PIDController integralPI = new PIDController(-0.001, -0.00396, 0, 0, 160, 0.01);
        // Say P gets saturated. 
        for (int i = 0; i <= 60000; i += 1) {
            double currentPosition = doubleIntegratorSim.getCurrentPos(); 
            integralPI.updateError(currentPosition); 
            doubleIntegratorSim.simulateVelocityAndPos(integralPI.getOutput());
            scouter.write(String.valueOf(doubleIntegratorSim.getCurrentPos()));
            scouter.write(","); 
            scouter.write(String.valueOf(i * 0.01)); 
            scouter.write(","); 
            scouter.write(String.valueOf(doubleIntegratorSim.getCurrentVelocity())); 
            scouter.write("\n");  
        }

        /*for (int i = 0; i <= 10000; i += 1) {
            scouter.write(String.valueOf(integralPI.getOutput()));
            scouter.write(","); 
            scouter.write(String.valueOf(i * 0.01)); 
            scouter.write(","); 
            scouter.write("\n"); 
        }*/

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); 
        }
    }
}