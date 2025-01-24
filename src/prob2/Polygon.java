package prob2;

public interface Polygon extends ClosedCurve{
    double[] getSides();

    default double computePerimeter() {
        double[] getSides = this.getSides();
        int length = this.getSides().length;
        double sum = 0.0;
        for (int i=0; i<length; i++ ){
            sum += getSides[i];
        }
        return sum;
    }
}
