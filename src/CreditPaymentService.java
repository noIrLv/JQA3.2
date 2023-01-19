public class CreditPaymentService {
    public double calculate(double year, double summ){
        double month = year * 12;
        double procent = 9.99;
        double procentMonth = procent / 12 /100;
        double procent1 = (1+procentMonth);

        // double credit = summ * (procent+(procent/(1+procent)*month-1));
        double credit = summ * procentMonth * Math.pow(procent1, month)/ (Math.pow(procent1, month)-1 );
        int credit1 =(int)Math.round(credit);

        return credit1;
    }

}
