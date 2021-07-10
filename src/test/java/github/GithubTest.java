package github;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {
    @Test
    void shouldFindJUnit5Example() {
        //Открываем страницу selenide на github
        open("https://github.com/selenide/selenide");
        //Кликаем по вкладке Wiki
        $(byText("Wiki")).click();
        //Кликаем по пунку Soft assertions
        $(byText("Soft assertions")).click();
        //Проверяем, есть ли упоминание JUnit5 на странице
        $("#wiki-body").shouldHave(text("JUnit5"));
        sleep(7000);

    }

}
