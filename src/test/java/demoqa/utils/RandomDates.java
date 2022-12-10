package demoqa.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDates {
    public static String getRandomDay() {
        List<String> days = Arrays.asList(
                "1", "2", "3");

        return days.get(new Random().nextInt(days.size()));
    }

    public static String getRandomMonth() {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December");

        return months.get(new Random().nextInt(months.size()));
    }

    public static String getRandomYear() {
        List<String> years = Arrays.asList(
                "2000", "2001", "2002");

        return years.get(new Random().nextInt(years.size()));
    }
}
