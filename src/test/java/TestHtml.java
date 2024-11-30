import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestHtml {

    @BeforeAll
    static void BeforeAll() {
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void testHtmlTest() {
        open("C:/Users/takli/IdeaProjects/HOME_work_Search_Junit/src/test/resources/test.html");
        $("h1 div").shouldHave(text("Test"));
    }

}


