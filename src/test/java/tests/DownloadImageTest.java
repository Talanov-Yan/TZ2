package tests;

import org.junit.Test;
import pages.GooglePage;
import pages.SearchImagePage;
import pages.SearchPage;

public class DownloadImageTest extends BaseTest {
    private final static String BASE_URL = "https://www.google.com";
    private final static String SEARCH_STRING = "Ян Таланов";

    @Test
    public void downloadImage() {
        GooglePage googlePage = new GooglePage(BASE_URL);
        googlePage.sendInputSearch(SEARCH_STRING);

        SearchPage searchPage = new SearchPage();
        searchPage.clickOnBtnImage();

        SearchImagePage searchImagePage = new SearchImagePage();
        searchImagePage.clickOnImage();

        searchImagePage.downloadImage();
    }
}
