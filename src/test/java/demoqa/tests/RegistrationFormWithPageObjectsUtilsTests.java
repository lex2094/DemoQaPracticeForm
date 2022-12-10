package demoqa.tests;

import demoqa.pages.RegistrationFormPage;
import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.ResultsModal;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RegistrationFormWithPageObjectsUtilsTests extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    ResultsModal resultsModal = new ResultsModal();
    CalendarComponent calendarComponent = new CalendarComponent();


    @Test
    void fillFormTest() {
        step( "Open form", () -> {
                    registrationFormPage.openPage();
        });
            step( "Fill form", () -> {
                registrationFormPage
                            .setFirstName(firstName)
                            .setLastName(lastName)
                            .setEmail(email)
                            .setGender("Other")
                            .setNumber(phone)
                            //.setBirthDate(day,month,year)
                            .setSubjectInput()
                            .setHobbiesWrapper()
                            .uploadPicture()
                            .setCurrentAddress()
                            .setState()
                            .setCity();
                });
        registrationFormPage.clickSubmit();
        step( "Check results", () -> {
            resultsModal.checkVisible();
        //registrationFormPage.checkResultsTableVisible()
                    //.checkResult("Student Name", firstName)
                    //.checkResult("Student Email", email)
                    //.checkResult("Date of Birth", day + " " + month + "," + year);
        resultsModal.checkVisible();
        });
    }
}
