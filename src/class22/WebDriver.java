package class22;

public class WebDriver {

public void startBrowser(){
    System.out.println("starting the browser");
}
public void openUrl(){
    System.out.println("opening  url");
}
public void testLoginPage(){
    System.out.println("checking if login page works");
}
public void closeBrowser(){
    System.out.println("closing the browser");
}
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the Url in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the Url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}
class Firefox extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting Firefox");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the Url in Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }
}
