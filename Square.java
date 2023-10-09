class Square implements Shape{
    private double mHeight; 
    private double mWidth; 

    public Square(double height, double width) {
        mHeight = height; 
        mWidth = width; 
    }
    @Override
    public double getArea() {
        return mHeight * mWidth; 
    }
    @Override
    public double getPerimeter() {
        return 2 * mHeight + 2 * mWidth; 
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