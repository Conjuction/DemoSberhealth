import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoSberHealth {
    @Test
    void checkTitle1(){
        open("https://sberhealth.ru/");
        $(".the-header__links").find(byText("Онлайн-консультации")).click();
        $(".Title__xaxpyys").shouldHave(text("Срочные консультации"));
    }

    @Test
    void checkTitle2(){
        open("https://sberhealth.ru/");
        $(".the-header__links").find(byText("Приём врача в клинике")).click();
        $(".top-seo-text__title").shouldHave(text("Запись на приём к лучшим врачам Москвы"));
    }
}
