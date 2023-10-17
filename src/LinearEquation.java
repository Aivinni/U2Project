public class LinearEquation {
    private final double X1;
    private final double Y1;
    private final double X2;
    private final double Y2;

    // PRECONDITION: X2 != X1
    public LinearEquation(double X1, double Y1, double X2, double Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }

    private double roundedToHundredth(double toRound) {
        toRound *= 100;
        toRound = (int)toRound;
        toRound /= 100.0;
        return toRound;
    }
    public double distance() {
        double distX = Math.abs(X2 - X1);
        double distY = Math.abs(Y2 - Y1);
        return roundedToHundredth(Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2)));
    }
    public double slope() {
        double run = X2 - X1;
        double rise = Y2 - Y1;
        if (!(run == 0)) {
            return roundedToHundredth(rise / run);
        } else {
            return 0.0;
        }
    }
    public double yIntercept() {
        return X1 - (X1 * slope());
    }
    public String equation() {
        double m = slope();
        double b = yIntercept();
        if (m == 0.0) {
            return "y = " + b;
        }
        return "y = " + m + "x " + "+ " + b;
    }
    public String coordinateForX(double x) {
        double m = slope();
        double b = yIntercept();
        return "(" + x + ", " + ((m * x) + b) + ")";
    }
    public String lineInfo() {
        return  "The two points are: " + "(" + X1 + "," + Y1 + ")" + " and " + "(" + X2 + "," + Y2 + ")" + " \n " +
        "The equation of the line between these points is:" + equation() + " \n" +
        "The slope of this line is: " + slope() + " \n" +
        "The y-intercept of this line " + yIntercept() + " \n" +
        "The distance between these points is " + distance();
    }
}
