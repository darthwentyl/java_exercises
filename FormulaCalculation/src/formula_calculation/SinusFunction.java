package formula_calculation;

public class SinusFunction implements Formula {

    private double counter = 0.0;
    private double k = 1.0;
    private double denominator = 1.0;

    public double calc(double x) {
        double partialResult = 0.0;
        final double delta = 0.0001;
        double result = 0.0;
        
        counter = x;
        result = counter / denominator;
        
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
        double n = 2 * k + 1;
        denominator = denominator * (n - 1) * n;
        return counter / denominator;
    }
}
