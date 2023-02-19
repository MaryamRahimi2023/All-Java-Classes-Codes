package Project2.Task4;

public interface WebDriver {

    /* 4. Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
          ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them */

    void open();
    void close();
    String getTitle();
}
 interface TakesScreenshot {

     void getScreenshot();

}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{

     void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println(getTitle()+" is opening");

    }

    @Override
    public void close() {
        System.out.println(getTitle()+" is closing");

    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void navigate() {
        System.out.println(getTitle()+" is Navigating to ....");

    }

    @Override
    public void getScreenshot() {
        System.out.println(getTitle()+" can get the Screen shot");

    }
}
class FirefoxDriver implements RemoteWebDriver,TakesScreenshot{
    @Override
    public void open() {
        System.out.println(getTitle() +" is opening");
    }

    @Override
    public void close() {
        System.out.println(getTitle() +" is closing");

    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void navigate() {
        System.out.println(getTitle() +" is Navigating");

    }

    @Override
    public void getScreenshot() {
        System.out.println(getTitle() +" can take the screen shot");

    }
}
class SafariDriver implements RemoteWebDriver,TakesScreenshot{
    @Override
    public void open() {
        System.out.println(getTitle() +" is opening");

    }

    @Override
    public void close() {
        System.out.println(getTitle() +" is closing");

    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void navigate() {
        System.out.println(getTitle() +" is navigating");

    }

    @Override
    public void getScreenshot() {
        System.out.println(getTitle() +" can take the Screen Shot");

    }
}
