package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HerokuappTests {
    @Test
    void AtoBTest() {
        //Открываем страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перемещаем квадраты
        $("#column-a").dragAndDropTo("#column-b");
        //Проверяем, что квадраты действительно поменялись местами
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
