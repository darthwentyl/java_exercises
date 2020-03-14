package formula_calculation;

public class ExpotentialFunction implements Formula {

    public double calc(double x) {
        double denominator = 1.0;
        double counter = 1.0;
        double result = 0.0;
        double partialResult = 0.0;
        double n = 1.0;
        final double delta = 0.0001;
        do {
            partialResult = counter / denominator;
            result += partialResult;
            counter *= x;
            denominator *= n;
            n++;
        } while(partialResult > delta);
        return result;
    }

}
