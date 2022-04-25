package practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Periods {

    public static void main(String[] args) {

        LocalDate firstDate = LocalDate.of(1995,05,23);
        LocalDate secondDate = LocalDate.now();

        System.out.println(getPeriodFromBirthday(firstDate, secondDate));
    }

    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {
        String date = "";
        if (firstDate == secondDate) {
            System.out.println("Даты равны");
        } else {
            Period dif = Period.between(firstDate, secondDate);
            date = date + "years:" + dif.getYears() + "," + " months:" + dif.getMonths() +  "," + " days:" + dif.getDays();
        }
        return date;
    }

}
