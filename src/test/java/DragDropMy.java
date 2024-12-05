import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.DragAndDropOptions.usingJavaScript;
import static com.codeborne.selenide.Selenide.*;


public class DragDropMy {
    @BeforeAll
    static void setup() {
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void dragAnddroptest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(210, 0).release().perform();

    }
    @Test
    void dragAnddrop1test() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b", usingJavaScript());
    }

}
