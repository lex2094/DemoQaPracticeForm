package demoqa.tests;

import demoqa.pages.RegistrationFormPage;
import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.ResultsModal;
import org.junit.jupiter.api.Test;

public class RegistrationFormWithPageObjectsUtilsTests extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    ResultsModal resultsModal = new ResultsModal();
    CalendarComponent calendarComponent = new CalendarComponent();


    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
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
        registrationFormPage.clickSubmit();
        resultsModal.checkVisible();
        //registrationFormPage.checkResultsTableVisible()
                    //.checkResult("Student Name", firstName)
                    //.checkResult("Student Email", email)
                    //.checkResult("Date of Birth", day + " " + month + "," + year);
        resultsModal.checkVisible();
    }
}
