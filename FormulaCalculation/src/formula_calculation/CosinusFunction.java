package formula_calculation;

public class CosinusFunction implements Formula {

    private double counter = 1.0;
    private double k = 1.0;
    private double denominator = 1.0;

    public double calc(double x) {
        final double delta = 0.0001;
        double partialResult = 1.0;
        double result = partialResult;
        do {
            partialResult = calcPartial(x);
            if (k % 2 == 0) {
                result += partialResult;
            } else {
                result -= partialResult;
            }
            k++;
        } while(Math.abs(partialResult) > delta);
        return result;
    }
    
    private double calcPartial(double x) {
        counter = counter * (x * x);
        double n = 2 * k;
        denominator = denominator * (n - 1) * n;
        return counter / denominator;
    }
}
