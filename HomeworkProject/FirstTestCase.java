package HomeworkProject;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");

        // Click on the w3schools consent pop-up
        driver.findElement(By.id("accept-choices")).click();
        
        driver.findElement(By.id("search2")).sendKeys("Java Tutorial");
        driver.findElement(By.id("learntocode_searchbtn")).click();
        driver.findElement(By.id("w3loginbtn")).click();
        driver.quit();
    }
}