package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement btnImage = $x("//a[contains(text(), \"Картинки\")]");

    public void clickOnBtnImage() {
        btnImage.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
    }
}
