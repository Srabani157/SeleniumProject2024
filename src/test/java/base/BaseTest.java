package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BaseTest {
    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties locator = new Properties();
    public static FileReader fileReader_config;
    public static FileReader fileReader_locators;
    public static Logger logger;

    public BaseTest() throws IOException {
        fileReader_config = new FileReader("src/test/resources/config/config.properties");
        fileReader_locators = new FileReader("src/test/resources/config/locators.properties");
        config.load(fileReader_config);
        locator.load(fileReader_locators);

    }

    @BeforeTest
    public void Initilization() throws IOException {

        if ((config.getProperty("browser")).equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.get(config.getProperty("url"));
        }
        if ((config.getProperty("browser")).equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.get(config.getProperty("url"));
            logger.info("URL is Opened");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterTest
    public void TearDown() {
        driver.close();
        System.out.println("Browser closed successfully");
    }
}
