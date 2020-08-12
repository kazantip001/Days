
public class Days {
    public Days() {
    }

    public static void main(String[] args) {
        int days = 5000;
        int years = days / 365;
        int monts = days % 365 / 31;
        int leftDays = days - years * 365 - monts * 31;
        System.out.println("Общее кол-во дней:" + days);
        System.out.println("Лет:" + years);
        System.out.println("Месяцев:" + monts);
        System.out.println("Дней:" + leftDays);
    }
}