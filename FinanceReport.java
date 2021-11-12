import java.util.Arrays;

public class FinanceReport{
    private Payment[] reports;
    public FinanceReport(int n)
    {
        reports = new Payment[n];
    }
    public Payment getReports(int i) {
        return reports[i];
    }

    public void setReports(Payment reports, int i) {
        this.reports[i] = reports;
    }

    public int getPayments()
    {
        return reports.length;
    }

    public Payment[] getReports() {
        return reports;
    }

    @Override
    public String toString() {
        StringBuilder n = new StringBuilder();
        String t = "Фио = %s, day = %d, Mounth = %d, year = %d, sumPayment = %f ";
        String t_last = "Фио = %s, day = %d, Mounth = %d, year = %d, sumPayment = %f";
        for(int i = 0; i< reports.length; i++)
        {
            if(i == reports.length-1) {
                n.append(String.format(t_last, reports[i].getFio(), reports[i].getDay(), reports[i].getMonth(), reports[i].getYear(), reports[i].getSumPayment()));
            }else{
                n.append(String.format(t, reports[i].getFio(), reports[i].getDay(), reports[i].getMonth(), reports[i].getYear(), reports[i].getSumPayment()));
            }
        }
        return n.toString();
    }
}
