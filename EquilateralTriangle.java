class EquilateralTriangle implements Shape {
    private double mHeight; 
    private double mBase; 

    public EquilateralTriangle(double height, double base) {
        mHeight = height; 
        mBase = base; 
    }
    @Override
    public double getArea() {
        return (mHeight * mBase) / 2; 
    }
    @Override
    public double getPerimeter() {
        return mBase + mBase + mBase; 
    }
    @Override
    public int getNumOfEdges() {
        return 3; 
    }
    @Override
    public int getNumOfCorners() {
        return 3; 
    }

}