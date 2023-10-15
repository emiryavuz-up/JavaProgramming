package JavaRecap.day38_BrowserTask;

public class BrowserTest {

    public static void main(String[] args) {

        FirefoxBrowser firefoxBrowser = new FirefoxBrowser();
        firefoxBrowser.openBrowser();
        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.openBrowser();
    }



}
