import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.example.GoogleSearchPage;
import org.openqa.selenium.example.ResultPage;
import org.openqa.selenium.example.WikipediaPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGoogleResult {

    private FirefoxDriver driver;

    @Before
    public void setupSelenium() {
        driver = new FirefoxDriver();
    }

    @After
    public void closeSelenium() {
        driver.close();
        driver.quit();
    }

    @Test
    public void ResearchContainsText() {
        GoogleSearchPage homePage = GoogleSearchPage.navigateTo(driver);
        String keystring = "Cheese";
        ResultPage resultsPage = homePage.searchFor(keystring);
        Assert.assertTrue(resultsPage.allResultsContainString(keystring));
    }
}