package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {

        // connect to the webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create the instance of Webdriver
        WebDriver driver=new ChromeDriver();

        // go to google.com
        driver.get("https://www.google.com/");

        // task01.maximize the window
        driver.manage().window().maximize();

        // open up full screen
        driver.manage().window().fullscreen();

        // close
        driver.close();










    }
}
