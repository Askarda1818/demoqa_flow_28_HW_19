package qa.guru.owner.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    public WebDriverProvider(){
       this.config = new WebDriverConfig();
    }

    private final WebDriverConfig config;
    @Override
    public WebDriver get(){
      WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }
    public WebDriver createWebDriver(){
        switch (config.getBrowser()){
            case CHROME:{
                WebDriverManager.chromedriver().setup();
                return  new ChromeDriver();
            }
            case FIREFOX:{
                WebDriverManager.firefoxdriver().setup();
                return  new FirefoxDriver();
            }
            default:{
                throw new RuntimeException("No such driver");
            }
        }
    }
}
