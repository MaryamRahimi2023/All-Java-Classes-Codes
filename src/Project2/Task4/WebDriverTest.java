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

        WebDriver [] webDrivers1= {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for (WebDriver webDriver2:webDrivers1) {
            webDriver2.open();
            webDriver2.close();
            webDriver2.getTitle();
           // webDriver2.navigate(); these methods are not available if we Create the object of the classes and store it in to WebDriver data type
           // webDriver2.getScreenshot();
        }

        TakesScreenshot [] webDrivers4 = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for (TakesScreenshot webDriver3:webDrivers4) {

            webDriver3.getScreenshot(); // only its own method is available
        }

    }
}
