package qa.guru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.sql.DriverManager.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void startDriver(){
        driver = getDriver();
    }
    @Test
    public  void testGithub(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        String title  = driver.getTitle();
        assertEquals("GitHub: Let’s build from here · GitHub", title);
        driver.quit();

    }
}
