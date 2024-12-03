import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class EnterprizeSearch {
    @BeforeAll
    static void beforeAll() {


        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
    }
        @Test
        void enterprizeTest(){

            open("https://github.com");
            $("nav.HeaderMenu-nav").$(byText("Solutions")).parent().hover();

            $(byTagAndText("a","Enterprises")).click();
            $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));





        }
    }
