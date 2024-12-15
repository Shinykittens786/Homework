public class SingleIntegrator {
    private double position; 
    private double timeStep; 
    // Want to be able to simulate the plant-- being controlled 
    // position
    public SingleIntegrator(double startingPosition, double timeInterval) { 
        position = startingPosition; 
        timeStep = timeInterval; 
    }

    public void simulate(double inputVelocity) {
        // non-static 
        // velocity = distance / time 
        // acceleration = velocity / time
        position += inputVelocity * timeStep;
        // xie xie :)
        // position = 0; 
        // input velocity is 500m/s
        // timestep is 0.01
        // d = v*t
        // dinitial + d = new d (over and over again, with new d becoming the new initial d)
        // this is just proportional? no its just raw
        // this is just simulation of the system 

    }

    public double getCurrentPos() {
        return position; 
    }



}