package Date;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUtils.dateToString(d, "yyyy-MM-dd HH:mm:ss");
        System.out.println(s);
        System.out.println("----------");

        String ss = "2020-04-09 19:48:40";
        Date dd = DateUtils.stringToDate(ss, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
