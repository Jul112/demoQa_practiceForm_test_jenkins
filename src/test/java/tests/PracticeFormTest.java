package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static utils.RandomUtils.*;

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
