package Stage_1.Quick_Task.src.main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiprimerTest {

@Test
public void searchBlogArticle() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();


    driver.get("https://qaxpert.com");

    driver.findElement(By.linkText("Blog")).click();
    Thread.sleep(2000);

    driver.quit();
    }

}
