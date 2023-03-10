package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        // connect a class to webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // initiate the instance of Webdriver
        WebDriver driver=new ChromeDriver();

        // open google.com   , can't go back with driver.get
        driver.get("https://www.google.com/");

        // slow down
        Thread.sleep(2000);

        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");

        // slow down
        Thread.sleep(2000);

        // go back
        driver.navigate().back();

        // slow down
        Thread.sleep(2000);

        // go to facebook
        driver.navigate().forward();

        // refresh the page
        driver.navigate().refresh();

        // close the browser   // driver.quit(); closes the whole browser
        driver.close();  // close is closing only the current tab







    }
}
