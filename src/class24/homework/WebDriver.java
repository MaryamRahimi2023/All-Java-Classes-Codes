package class24.homework;


/*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(),
closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface:
ChromeDriver and FirefoxDriver.*/
public interface WebDriver {

   void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens Chrome Browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closes Chrome Browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Window");

    }

    @Override
    public void findElement() {
        System.out.println("Finds Elements in the page of Chrome Browser");

    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens Firefox Browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closes Firefox Browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox Window");

    }

    @Override
    public void findElement() {
        System.out.println("Finds Elements in the page of Firefox Browser");

    }
}
