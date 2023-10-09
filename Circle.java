class Circle implements Shape{
    private double mRadius; 

    public Circle(double radius) {
        mRadius = radius; 
    }
    @Override
    public double getArea() {
        return mRadius * mRadius * 3.1415926535; 
    }
    @Override
    public double getPerimeter() {
        return 2 * mRadius * 3.1415926535; 
    }
    @Override
    public int getNumOfEdges() {
        return 0; 
    }
    @Override
    public int getNumOfCorners() {
        return 0; 
    }

}