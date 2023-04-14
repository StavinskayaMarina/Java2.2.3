import static java.lang.Math.pow;
import static java.lang.Math.round;

public class CreditPaymentService {
    public double calculate(double s, int t, double p) {
        int period = t * 12; // кол-во месяцев
        double mr = p / (100 * 12); // процент месячног платежа

        double result = s * (mr / (1 - (pow(1 + mr, -period))));


        return round(result);
    }
}
