class RightAngledTriange implements Shape {
    private double mHeight; 
    private double mBase; 

    public RightAngledTriange(double height, double base) {
        mHeight = height;
        mBase = base;
    }
    @Override
    public double getArea() {
        return (mHeight * mBase) / 2; 
    }
    @Override
    public double getPerimeter() {
        double hypotenuse; 
        hypotenuse = mHeight * mHeight + mBase * mBase; 
        hypotenuse = Math.sqrt(hypotenuse); 
        return hypotenuse + mHeight + mBase; 
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