package demoqa.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Day {
    public static String getRandomDate() {
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
}
