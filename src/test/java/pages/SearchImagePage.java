package pages;

import com.codeborne.selenide.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class SearchImagePage {
    private final SelenideElement searchImage= $x("//div[@id=\"islrg\"]/div/div[3]//img");
    private final SelenideElement img = $x("//*[@id=\"Sva75c\"]/div/div/div[3]/div[2]/c-wiz/div/div[1]/div[1]/div[3]/div/a/img");


    public void clickOnImage() {
        searchImage.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
    }

    public File downloadImage() {

        File file = null;
        try {
            file = img.shouldBe(Condition.visible, Duration.ofSeconds(10)).download();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return file;
    }
}
