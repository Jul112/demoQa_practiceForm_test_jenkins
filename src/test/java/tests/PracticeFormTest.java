package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

public class PracticeFormTest extends TestBase {
    PracticeFormPage practiceFormPage;

    @Test
    void fillPracticeFormTest() {
        practiceFormPage = new PracticeFormPage();

        practiceFormPage.openPage();
        practiceFormPage.fillForm();
        practiceFormPage.checkData();
    }
}
