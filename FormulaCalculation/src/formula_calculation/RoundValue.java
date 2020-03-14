package formula_calculation;

public class RoundValue {
    static public double round(double val, double pos) {
        double comaPos = Math.pow(10, pos);
        val *= comaPos;
        val = Math.round(val);
        val /= comaPos;
        return val;
    }
}
