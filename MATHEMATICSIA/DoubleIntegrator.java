

public class DoubleIntegrator {
    private double mPosition; 
    private double mVelocity; 
    private double mTimestep; 
    public DoubleIntegrator(double position, double velocity, double timestep) {
        mPosition = position; 
        mVelocity = velocity; 
        mTimestep = timestep; 
    }


// DOUBLE INTEGRATOR SIMULATION. CAPPED INPUT (V AND A) AND ALSO ADDED FRICTION CONSTANT
    public void simulateVelocityAndPos(double acceleration) {
        if (acceleration > 50) { // added new && statements
            acceleration = 50;  
        } if (acceleration < -50) {
            acceleration = -50;  
        } if (acceleration <= 0.05 && acceleration >= -0.05) {
            acceleration = 0; 
        }
        mPosition += mVelocity * mTimestep; 
        mVelocity += acceleration * mTimestep; 
        if (mVelocity > 100) { // used to be 100
            mVelocity = 100; 
        } if (mVelocity < -100) {
            mVelocity = -100; 
        } 
        mVelocity -= mVelocity * 0.1 * mTimestep; // used to be 0.1
    }

    public double getCurrentPos() {
        return mPosition; 
    }

    public double getCurrentVelocity() {
        return mVelocity; 
    }


    public double capAcceleration(double acceleration) {
        if (acceleration > 5) {
            acceleration = 5; 
            return acceleration; 
        } if (acceleration < -5) {
            acceleration = -5;
            return acceleration;  
        }
        return acceleration; 
    }    
    
    public double capVelocity(double velocity) {
        if (velocity > 10) {
            velocity = 10; 
            return velocity;
        } if (velocity < -10) {
            velocity = -10;
            return velocity;  
        }
        return velocity; 
    }

}