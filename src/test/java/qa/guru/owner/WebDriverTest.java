package qa.guru.owner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
    @Test
    public  void testGuthub(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        String title  = driver.getTitle();
        assertEquals("GitHub: Let’s build from here · GitHub", title);

    }
}
