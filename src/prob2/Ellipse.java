package prob2;

public class Ellipse implements ClosedCurve {
    private double a;
    private double E;

    public Ellipse(double a, double e) {
        this.a = a;
        E = e;
    }


    @Override
    public double computePerimeter() {
        return 4.0 * this.a * this.E;
    }
}
