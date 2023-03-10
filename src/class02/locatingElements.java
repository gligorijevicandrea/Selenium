package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
/*
"LinkedText" is used to locate web elements based on the exact text of a hyperlink vs
"PartialLinkText" is used to locate web elements based on a partial match of the text of a hyperlink.
 */

        // connect to the webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create the instance of Webdriver
        WebDriver driver=new ChromeDriver();

        // open up facebook.com
        driver.get("https://www.facebook.com/");

        // send in the username
        driver.findElement(By.id("email")).sendKeys("moazzam");

        // send in password
        driver.findElement(By.name("pass")).sendKeys("abracdabra");

        // click on the button create New Account
        driver.findElement(By.linkText("Create new account")).click();

        // click on forgotten password
        driver.findElement(By.partialLinkText("password?")).click();

        // close the browser
        driver.quit();



    }

}
