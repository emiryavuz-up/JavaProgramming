package JavaRecap.day45_BrowserTask;

public class DriverObjects {

    public static void main(String[] args) {

    ChromeBrowser browser = new ChromeBrowser("chrome");

        browser.executeScript("Java Script Executor");
        browser.findElements("xpath");
        browser.findElements("by class name");
        browser.takeScreenShot();
        browser.get("https://google.com");
        browser.getTitle();

    }

}

/*
Create a class named DriverObjects:
				Create objects of each driver

				Test all the methods of each driver
 */