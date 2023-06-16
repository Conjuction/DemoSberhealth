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
       // $(".Input__c1m3wrv4").click();
        //$(".Input__iaxpyys").setValue("Аллерголог").pressEnter();
       // $(".d1sc2n3k__20230615083111 a").shouldHave(text("Аллерголог"));
    }

    @Test
    void checkTitle2(){
        open("https://sberhealth.ru/");
        $(".the-header__links").find(byText("Приём врача в клинике")).click();
        $(".top-seo-text__title").shouldHave(text("Запись на приём к лучшим врачам Москвы"));
        //$("#autocomplete__placeholder").click();
        //$(".v-autocomplete-input").setValue("Реаниматолог").pressEnter();
        //$(".search-form__button").click();
        //$(".top-seo-text__title").shouldHave(text("Врачи-реаниматологи"));

    }
}
