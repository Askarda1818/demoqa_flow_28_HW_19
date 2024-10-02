package qa.guru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qa.guru.owner.config.WebDriverProvider;

import static java.sql.DriverManager.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
   // private WebDriver driver;
   private  WebDriver driver;

    @BeforeEach
    public void startDriver(){
        // Подготовка драйвера
        driver = new WebDriverProvider().get();
    }
    @Test
    public  void testGithub(){
        // тело выполнения тесте
        String title  = driver.getTitle();
        assertEquals("GitHub: Let’s build from here · GitHub", title);

    }
    @AfterEach
    public void stopDriver(){
        driver.quit();
    }

    /*private WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        return driver;
    }*/
}
