
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;



public class SearchSoft {
    @BeforeAll
    static void beforeAll() {

        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void searchSoftTest() {


        String junitText = """
            @ExtendWith({SoftAssertsExtension.class})
            class Tests {
              @Test
              void test() {
                Configuration.assertionMode = SOFT;
                open("page.html");
               \s
                $("#first").should(visible).click();
                $("#second").should(visible).click();
              }
            }""";

        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-wrapper").shouldHave(text("SoftAssertions"));
        $$(".markdown-body .heading-element").findBy(text("3. Using JUnit5 extend test class:")).parent().sibling(0).shouldHave(exactText(junitText));

    }

}
