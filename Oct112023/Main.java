class Main {
    // ------ QUESTION 1 ------- //
// Given two points, figure out what line goes between those two points. 
// Given a value x, return the corresponding y-value on the line you just found.
// Example: x1=0, y1=0, x2=1, y2=1, x=2 -> Should return 2.
static double lineInterpolate(double x1, double y1, double x2, double y2, double x) {
    double m; 
    m = (y2 - y1) / (x2- x1); 
    double b; 
    b = -(m * x1) + y1; 
    double y; 
    y = m * x + b; 
    return y; 
}

    public static void main(String []args) {
        System.out.println(lineInterpolate(0.0, 0.0, 1.0, 1.0, 2.0));  
        System.out.println(lineInterpolate(0.0, 1.0, 1.0, 2.0, 2.0));  
    }
}