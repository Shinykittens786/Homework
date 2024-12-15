public class Main {
    public static void main(String[] args) {
        System.out.println("i smell the turkey cooking");
        SingleIntegrator singleIntegratorSim = new SingleIntegrator(/* position*/160, /* timestep*/ 0.01); 
            // Geminid-- meteor shower 
            // not meteora the linkin park album
        for (int i = 0; i <= 1000; i += 1) {
            double currentpos = singleIntegratorSim.getCurrentPos(); 
            singleIntegratorSim.simulate(currentpos * -3);
            System.out.println(singleIntegratorSim.getCurrentPos());
        }
    }
}