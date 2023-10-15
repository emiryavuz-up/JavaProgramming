package aHomeTasks.day45.browserTask;

public class RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecutor{

    private final String browserName;

    public RemoteWebDriver(String browserName){
        for (char eachCh : browserName.toCharArray()) {
            if( !(Character.isLetterOrDigit(eachCh)) ){
                throw new RuntimeException("Name must not contain special characters");
            }
        }
        if(browserName.isEmpty()){
            throw new RuntimeException("Name must not be empty");
        }
        this.browserName = browserName;
        System.out.println("Opening " + browserName + " browser.");
    }

    public String getBrowserName(){
        return browserName;
    }



    @Override
    public void findElement(String locator) {
        System.out.println(browserName + " driver locating an element by " + locator + ".");
    }

    @Override
    public void findElements(String locator) {
        System.out.println(browserName + " driver locating multiple elements by " + locator + ".");
    }

    @Override
    public void get(String url) {
        System.out.println("Getting the " + url + " on " + " " + browserName + " browser.");
    }

    @Override
    public void close() {
        System.out.println("Closing the tab on " + browserName + " browser;");
    }

    @Override
    public void quit() {
        System.out.println("Quitting the " + browserName + " browser.");
    }

    @Override
    public void getTitle() {
        System.out.println(browserName + " driver is getting the title.");
    }
    @Override
    public void takeScreenShot(){
        System.out.println("Taking screenshot on "  + browserName + " browser.");
    }

    @Override
    public void executeScript(String script){
        System.out.println("Executing \"" + script + "\" script on" + browserName + " browser.");
    }




}

/*
Create a class named RemoteWebDriver that implements WebDriver, TakeScreenShot, and JavaScriptExecuter Interface:
				Variables:
					browserName (final)

				Encapsulate all the fields

				Add Constructor that can set the field and displays the following message:
							"Opening "+ browserName+" browser"

				Overridden methods and their implementations:
						get(String url):
								"Getting the "+url+" on " + browserName + " browser"

						findElement(String locator):
								browserName+" driver locating an element by " + locator

						findElements(String locator):
								browserName+" driver locating multiple elements by " + locator

						close():
							"Closing the tab on "+browserName+" browser"

						quit():
							"Quitting the "+browserName+" browser"

						getTitle():
							browserName + "driver is getting the title"

						takeScreenShot():
							"Taking screenshot on: " + browserName + " browser"

						executeScript(String script):
							"Executing \"" + script + "\" script on" + browserName +" browser"
 */
