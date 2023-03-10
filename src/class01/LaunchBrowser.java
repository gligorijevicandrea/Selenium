package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // tell the project where the webdriver is located.
        // mac - no .exe , that's just for Windows

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // open the website google.com
        driver.get("https://www.facebook.com/");  // get waits , navigate doesn't wait

        // get the current url that is there in the browser
        String URL = driver.getCurrentUrl();

        // print out the url
        System.out.println(URL);

        // get the title of the webpage
        String title = driver.getTitle();

        // print the title of the page
        System.out.println("the title of the page is "+title);

        // to close the browser after 3 seconds
        Thread.sleep(3000);   // command enter .. for sleep not to be red , we should click on it and choose add exception to method signature

        // close the browser
        driver.quit();  // or driver.close();

    }
}
