import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void selenideSearchTest() {
        // Открыть Yandex
        open("https://www.yandex.com/");

        // Ввести Selenide в поиск
        $(byName("text")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $(".main__content").shouldHave(text("selenide.org"));
    }
}
