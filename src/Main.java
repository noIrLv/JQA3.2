public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int year = 1;
        double summ = 1_000_000;

        double payment = service.calculate(year,summ);
        System.out.println();
        System.out.println("1 год ");
        System.out.println(service.calculate(1,1000000));

        System.out.println();
        System.out.println("2 годa ");
        System.out.println(service.calculate(2,1000000));

        System.out.println();
        System.out.println("3 годa ");
        System.out.println(service.calculate(3,1000000));

    }
}