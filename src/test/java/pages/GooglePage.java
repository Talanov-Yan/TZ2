package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {

    private final SelenideElement searchInput = $x("//input[@name=\"q\"]");

    public GooglePage(String url) {
        Selenide.open(url);
    }

    public void sendInputSearch(String text) {
        searchInput.should(Condition.visible, Duration.ofSeconds(10)).sendKeys(text);

        searchInput.shouldBe(Condition.visible, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
