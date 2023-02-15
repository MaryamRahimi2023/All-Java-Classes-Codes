package class24.homework;

import class24.homework.ChromeDriver;
import class24.homework.FirefoxDriver;
import class24.homework.WebDriver;

public class WebDriverTester {

    public static void main(String[] args) {

        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver webDriver:webDrivers) {
            webDriver.openBrowser();
            webDriver.closeBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();

        }
    }
}
