import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);
    LinearEquation equation1;
    boolean run;

    public LinearEquationLogic() {}

    public void start() {
        getData();
        printInfo();
        valueForX();
    }
    // REMEMBER: space after ,
    public void getData() {
        System.out.println("What is the first point on the graph? ");
        String point1 = scan.nextLine();
        double x1 = Integer.parseInt(point1.substring(point1.indexOf("(") + 1, point1.indexOf(", ")));
        double y1 = Integer.parseInt(point1.substring(point1.indexOf(", ") + 2, point1.indexOf(")")));
        System.out.println("What is the second point on the graph? ");
        String point2 = scan.nextLine();
        double x2 = Integer.parseInt(point2.substring(point1.indexOf("(") + 1, point2.indexOf(",")));
        double y2 = Integer.parseInt(point2.substring(point1.indexOf(", ") + 2, point2.indexOf(")")));
        equation1 = new LinearEquation(x1, y1, x2, y2);
    }
    public void printInfo() {
        if (!equation1.errorCheck()) {
            System.out.println(equation1.lineInfo());
        }
        if (equation1.errorCheck()) {
            System.out.println("WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println(" WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("  WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("   WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("    WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("     WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("      WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("       WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("You have attempted to divide by 0");
            System.out.println("DO NOT ATTEMPT AGAIN");
            System.out.println("Division by 0 will result in a black hole, and the inevitable destruction of humanity");
            System.out.println("YOU HAVE BEEN WARNED");
            System.out.println("WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("       WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("      WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("     WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("    WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("   WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("  WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println(" WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            System.out.println("WARNING WARNING WARNING WARNING WARNING WARNING WARNING");
            run = false;
        }
    }
    public void valueForX() {
        double x;
        run = true;
        while (run) {
            System.out.println("Enter a value for x: ");
            x = scan.nextDouble();
            scan.nextLine();
            System.out.println("The point on the line is " + equation1.coordinateForX(x));
            System.out.println("Would you like to input a different X value? y/n ");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                run = false;
            }
        }
    }
}
