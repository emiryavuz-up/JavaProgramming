package aHomeTasks.day45.browserTask;

public class ChromeDriver extends RemoteWebDriver {

    public ChromeDriver(String browserName){
        super(browserName);
    }


    public static void main(String[] args) {

        RemoteWebDriver remoteWebDriver1 = new RemoteWebDriver("Chrome");

        remoteWebDriver1.executeScript("Script 1");
        remoteWebDriver1.findElement("Locator 123958");
        remoteWebDriver1.takeScreenShot();

    }


}
