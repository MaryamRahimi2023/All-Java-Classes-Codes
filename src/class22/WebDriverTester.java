package class22;

public class WebDriverTester {

    public static void main(String[] args) {

        /*
        Chrome googleChrome=new Chrome();

        googleChrome.startBrowser();
        googleChrome.openUrl();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        System.out.println();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openUrl();
        safari.testLoginPage();
        safari.closeBrowser();

        System.out.println();

        Firefox fireFox=new Firefox();
        fireFox.startBrowser();
        fireFox.openUrl();
        fireFox.testLoginPage();
        fireFox.closeBrowser();*/

        /* polymorphism is how to create the obj of child class inside parent class and calling the methods, we need datatype casting here too coz we can store
            an object of child class into parent class(Up casting is allowed) but not an object of parent class in variable
            of child class(down casting not allowed).*/

        // store an obj of child class inside the parents, and then we can use it as below

      /*  WebDriver webDriver=new Chrome(); it is a run time polymorphism

        webDriver.startBrowser();
        webDriver.openUrl();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        WebDriver webDriver1=new Safari();

        webDriver1.startBrowser();
        webDriver1.openUrl();
        webDriver1.testLoginPage();
        webDriver1.closeBrowser();

        WebDriver webDriver2=new Firefox();

        webDriver2.startBrowser();
        webDriver2.openUrl();
        webDriver2.testLoginPage();
        webDriver2.closeBrowser();*/

        // using Array to print for all objects of the classes the test cases

        // creating objects first then store in an array

        /*

        Chrome chrome=new Chrome();
        Firefox firefox=new Firefox();
        Safari safari=new Safari();

        WebDriver [] browsers={chrome,firefox,safari};*/

        // directly creating an object

        WebDriver [] browsers={new Chrome(),new Safari(),new Firefox()};
        // if more browser only add the object of it in array after you create the relation between parent and child class and same methods
        // from other classes override and in selenium it is already done only we need to create the obj and test it or utilize it
        // an array of parent class can hold the objects of all the child classes

        for (WebDriver browser:browsers) {
            browser.startBrowser();
            browser.openUrl();
            browser.testLoginPage();
            browser.closeBrowser();
        }

    }
}
