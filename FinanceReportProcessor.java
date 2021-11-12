import java.util.Arrays;
public class FinanceReportProcessor
{
    public static FinanceReport CharReport(FinanceReport reports, char a)
    {

            FinanceReport n = new FinanceReport(reports.getPayments());
            for(int i = 0; i<reports.getPayments(); i++)
            {
                int j = 0;
                if(Character.toLowerCase((char) reports.getReports(i).getFio().charAt(0)) == Character.toLowerCase((char)a))
                {
                    n.setReports(reports.getReports(i), j);
                    j++;
                }
            }
            return n;

    }
    public static FinanceReport DemensionReports(FinanceReport reports, double a)
    {
        FinanceReport n = new FinanceReport(reports.getPayments());
        for(int i = 0; i<reports.getPayments(); i++)
        {
            if(Double.compare(a,reports.getReports(i).getSumPayment()) > 0)
            {
                n.setReports(reports.getReports(i), i);
            }
        }
        return n;
    }

}
