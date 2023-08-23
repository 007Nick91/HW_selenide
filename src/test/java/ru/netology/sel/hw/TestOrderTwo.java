package ru.netology.sel.hw;

//import com.codeborne.selenide.Condition;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.Keys;
//
//import java.time.Duration;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.$;
//
//public class TestOrderTwo {
//    private String genDate(int addDay, String pattern) {
//        return LocalDate.now().plusDays(addDay).format(DateTimeFormatter.ofPattern(pattern));
//    }
//
//    @Test
//    void shouldRegisterDeliveryNextMonth() {
//        open("http://localhost:9999/");
//        $("[data-test-id=city] input").setValue("Кра");
//        $$(".menu-item__control").findBy(Condition.text("Краснодар")).click();
//
//        String corectDay = genDate(3, "dd.MM.yyyy");
//        if (genDate(3, "MM").equals(genDate(10, "MM")) == false) {$x("calendar__arrow calendar__arrow_direction_right").click();
//        } else {return genDate(3, "MM"); }
//        $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
//        $("[data-test-id=date] input").setValue(corectDay);
//        $("[data-test-id=name] input").setValue("Петров Никита");
//        $("[data-test-id=phone] input").setValue("+71231231234");
//        $("[data-test-id=agreement]").click();
//        $("button.button").click();
//        $("[data-test-id=notification] .notification__content")
//                .shouldBe(Condition.visible, Duration.ofSeconds(15))
//                .shouldHave(Condition.exactText("Встреча успешно забронирована на " + corectDay));
//
//
//    }
//
//}
