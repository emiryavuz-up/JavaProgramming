package aHomeTasks.day45.browserTask;

public interface WebDriver extends SearchContext {

    void get(String url);
    void close();
    void quit();
    void getTitle();


}
