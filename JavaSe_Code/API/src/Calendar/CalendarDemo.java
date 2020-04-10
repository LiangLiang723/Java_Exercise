package Calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        c.set(2022,11,20);
        c.add(Calendar.YEAR, 3);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
