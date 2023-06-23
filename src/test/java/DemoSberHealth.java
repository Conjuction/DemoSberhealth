import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoSberHealth extends TestBase {
    @Test
    void checkTitleOnlineConsultations() {
        $(".the-header__links").find(byText("Онлайн-консультации")).click();
        $(".Title__xaxpyys").shouldHave(text("Срочные консультации"));
        // $(".Input__c1m3wrv4").click();
        //$(".Input__iaxpyys").setValue("Аллерголог").pressEnter();
        // $(".d1sc2n3k__20230615083111 a").shouldHave(text("Аллерголог"));
    }

    @Test
    void checkTitleDoctorsAppointment () {
        $(".the-header__links").find(byText("Приём врача в клинике")).click();
        $(".top-seo-text__title").shouldHave(text("Запись на приём к лучшим врачам Москвы"));
        //$("#autocomplete__placeholder").click();
        //$(".v-autocomplete-input").setValue("Реаниматолог").pressEnter();
        //$(".search-form__button").click();
        //$(".top-seo-text__title").shouldHave(text("Врачи-реаниматологи"));
    }

    @CsvSource({
            "Головы, Головы",
            "ЖКТ, ЖКТ",
            "Зрения, Зрения",
            "Слуха, Слуха",
            "Лимфатической системы, лимфоузлов",
            "ОДА (опорно-двигательного аппарата), ОДА (опорно-двигательного аппарата)",
            "Конечностей, Конечностей",
            "Суставов, Суставов",
            "Сердечно-сосудистой системы, Сердечно-сосудистой системы",
            "Эндокринной системы, Эндокринной системы",
            "Органов дыхания, Органов дыхания",
            "Органов брюшной полости, Органов брюшной полости",
            "Органов малого таза, органов малого таза и мочеполовой системы",
            "Половых органов, Половых органов",
            "Мягких тканей, Мягких тканей"
    })
    @ParameterizedTest(name = "Проверка перехода по страницам после выбора исследования {0}")
    void checkTitleDiagnostics(String study,
                     String diagnostics) {
        $(".the-header__links").find(byText("Диагностика")).click();
        $(".organ-top-list__title").shouldHave(text("Подобрать исследование"));
        $(".organ-top-list").find(byText(study)).click();
        $(".title").shouldHave(text("Виды диагностики " + diagnostics + " в Москве:"));
        $(".logo_link").click();
    }
}
