class Parallelogram implements Shape{
    private double mHeight; 
    private double mWidth; 

    public Parallelogram(double height, double width) {
        mHeight = height; 
        mWidth = width; 
    }
    @Override
    public double getArea() {
        return mHeight * mWidth; 
    }
    @Override
    public double getPerimeter() {
        double hypotenuse; 
        hypotenuse = mHeight * mHeight + mWidth * mWidth;  
        hypotenuse = Math.sqrt(hypotenuse); 
        return hypotenuse + mWidth + hypotenuse + mWidth;  
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