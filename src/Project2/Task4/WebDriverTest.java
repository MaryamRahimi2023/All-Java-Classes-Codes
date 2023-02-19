package Project2.Task4;

public class WebDriverTest {

    public static void main(String[] args) {


        RemoteWebDriver [] webDrivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for (RemoteWebDriver webDriver:webDrivers) {
            webDriver.open();
            webDriver.close();
            webDriver.getTitle();
            webDriver.navigate();
            webDriver.getScreenshot();

        }


    }
}
