import static java.lang.Math.pow;
import static java.lang.Math.round;

public class CreditPaymentService {
    public double calculate(double total, int date, double ante) {
        int period = date * 12; // кол-во месяцев
        double monthlyPayment = ante / (100 * 12); // процент месячного платежа

        double result = total * (monthlyPayment / (1 - (pow(1 + monthlyPayment, -period))));


        return round(result);
    }
}
