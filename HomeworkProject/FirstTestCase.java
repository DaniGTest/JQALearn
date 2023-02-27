package HomeworkProject;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTestCase {
    private static ChromeDriver driver;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSearchFieldAndLoginButton() {
        driver.get("https://www.w3schools.com/");
        closePopUp();

        String actualW3SchoolsTitle = driver.getTitle();
        String expectedW3SchoolsTitle = "W3Schools Online Web Tutorials";
        Assert.assertEquals("W3Schools Title is not: W3Schools Online Web Tutorials", expectedW3SchoolsTitle, actualW3SchoolsTitle);

        driver.findElement(By.id("search2")).sendKeys("Java Tutorial");
        driver.findElement(By.id("learntocode_searchbtn")).click();
        String actualTitleAfterSearch = driver.getTitle();
        String expectedTitleAfterSearch = "Java Tutorial";
        Assert.assertEquals("Title is not: Java Tutorial", expectedTitleAfterSearch, actualTitleAfterSearch);

        driver.findElement(By.id("w3loginbtn")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com";
        Assert.assertEquals("URL is not: https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com", expectedUrl, actualUrl);
    }

    @AfterClass
    public static void quitBrowser() {
        driver.quit();
    }

    public void closePopUp() {
        driver.findElement(By.id("accept-choices")).click();
    }
}