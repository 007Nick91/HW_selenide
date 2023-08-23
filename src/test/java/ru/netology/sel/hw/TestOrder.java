package ru.netology.sel.hw;

import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.*;

public class TestOrder {

    private String genDate(int addDay, String pattern) {
        return LocalDate.now().plusDays(addDay).format(DateTimeFormatter.ofPattern(pattern));
    }

    @Test
    void shouldRegisterDelivery() {
        open("http://localhost:9999/");
        $("[data-test-id=city] input").setValue("Краснодар");
        String corectDay = genDate(5, "dd.MM.yyyy");
        $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        $("[data-test-id=date] input").setValue(corectDay);
        $("[data-test-id=name] input").setValue("Петров Никита");
        $("[data-test-id=phone] input").setValue("+71231231234");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $("[data-test-id=notification] .notification__content")
                .shouldBe(Condition.visible, Duration.ofSeconds(15))
                .shouldHave(Condition.exactText("Встреча успешно забронирована на " + corectDay));


    }


}
