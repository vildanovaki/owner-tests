package com.vildanova.tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebDriverTest extends TestBase{

    @Test
    void testSearch() {
        step("Открыть страницу https://github.com/", () ->
                open("https://github.com/"));


        step("Проверить текст заголовка страницы", () ->
                assertThat(title()).isEqualTo("GitHub: Where the world builds software · GitHub"));
    }
}
