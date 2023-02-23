package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    @Test
    public void selenideWikiSoftAssertionsSearchTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("JUnit5"));
    }

}
