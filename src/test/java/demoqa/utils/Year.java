package demoqa.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Year {
    public static String getRandomYear() {
        List<String> years = Arrays.asList(
                "2000", "2001", "2002");

        return years.get(new Random().nextInt(years.size()));
    }
}
