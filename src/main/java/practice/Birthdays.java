package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);

        int number = 0;
        String date = "";

            while (birthday.isBefore(today) || birthday.isEqual(today)) {
                date = date + number++ + " - " + formatter.format(birthday) + System.lineSeparator();
                birthday = birthday.plusYears(1);
            }
            return date;
        }
    }
