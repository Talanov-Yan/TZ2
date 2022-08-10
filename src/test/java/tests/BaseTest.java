package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.FileDownloadMode.PROXY;

abstract public class BaseTest {

    public void browser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = browser;
        } else if (browser.equals("firefox")) {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = browser;
        }
    }
    public void setUp() {
        browser("chrome");
        Configuration.driverManagerEnabled = true;
        Configuration.proxyEnabled = true;
        Configuration.fileDownload = PROXY;
    }
    @Before
    public void init() {
        setUp();
    }
    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
