package demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import demoqa.utils.RandomDates;
import org.junit.jupiter.api.BeforeAll;

import java.util.Locale;

public class TestBase extends RandomDates {

    Faker faker = new Faker(new Locale("en"));

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String day = getRandomDay();
    String phone = faker.phoneNumber().subscriberNumber(10);
    String month = getRandomMonth();
    String year = getRandomYear();

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}
