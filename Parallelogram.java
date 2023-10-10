class Parallelogram implements Shape{
    private double mHeight; 
    private double mWidth; 
    private int mAngle; 

    public Parallelogram(double height, double width, int angle) {
        mHeight = height; 
        mWidth = width; 
        mAngle = angle; 
    }
    @Override
    public double getArea() {
        return mHeight * mWidth; 
    }
    @Override
    public double getPerimeter() {
        double sideA = mHeight / Math.sin(mAngle); 
        return 2 * sideA + 2 * mWidth; 
    }
    @Override
    public int getNumOfEdges() {
        return 4; 
    }
    @Override
    public int getNumOfCorners() {
        return 4; 
    }

}