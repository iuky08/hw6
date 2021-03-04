import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

final class GoogleTest {

    @Test
    void searchSelenideTest() {
        open("https://www.google.com");

        $(byName("q")).val("Selenide").pressEnter();
        $("#rso a").shouldHave(href("https://ru.selenide.org/"));
    }
}
