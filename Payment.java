import java.util.Objects;

public class Payment {
    private String fio;
    private int day;
    private int month;
    private int year;
    private double sumPayment;

    public Payment(String fio, int a, int b, int c, double sum) {
        boolean gap;
        this.fio = fio;
        if (((year % 4 == 0) && (year % 100) != 0) || (year % 400 == 0)) {
            year = c;
            gap = false;
        } else {
            year = c;
            gap = true;
        }
        if (1 <= b && b <= 12) {
            month = b;
        } else {
            throw new IllegalArgumentException("Вы конченый и не знаете сколько месяцев в году");
        }
        if (month == 2 && gap == true) {
            if (1 <= a && a <= 29) {
                day = a;
            } else {
                throw new IllegalArgumentException("Некорректно введен день");
            }
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (1 <= a && a <= 31) {
                    day = a;
                } else {
                    throw new IllegalArgumentException("Некорректно введен день");
                }
            } else {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (1 <= a && a <= 30) {
                        day = a;
                    } else {
                        throw new IllegalArgumentException("Некорректно введен день");
                    }
                }
            }
        }
        if(Double.compare(sum, 0) >0 || Double.compare(sum, 0) ==0)
        {
            sumPayment = sum;
        } else
        {
            throw new IllegalArgumentException("Некорректно введена сумма");
        }
    }

    public int getDay() {
        return day;
    }

    public double getSumPayment() {
        return sumPayment;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFio() {
        return fio;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setSumPayment(double sumPayment) {
        this.sumPayment = sumPayment;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day && month == payment.month && year == payment.year && Double.compare(payment.sumPayment, sumPayment) == 0 && Objects.equals(fio, payment.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, day, month, year, sumPayment);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "fio='" + fio + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", sumPayment=" + sumPayment +
                '}';
    }
}