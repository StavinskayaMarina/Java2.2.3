public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000; // сумма кредита
        int time = 3; // срок кредита
        double percent = 9.99; // процентная ставка
        double payment = service.calculate(sum, time, percent);
        System.out.println(payment);
    }
}