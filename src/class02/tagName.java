package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {


        // connect to the webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create the instance of Webdriver
        WebDriver driver=new ChromeDriver();

        // maximize
        driver.manage().window().maximize();

        // go to amazon.com
        driver.get("https://www.amazon.com/");

        // print all the links in the amazon.com
        driver.findElements(By.tagName("a"));









    }
}
