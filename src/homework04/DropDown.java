package homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    /*
    goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
     */
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        // create instance of Webdriver
        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // locate the WebElement
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        //use select class because this drop down has a select tag
        Select sel=new Select(dropdown);

        // using select class we have different methods to select the desired option
        // select by Index
        sel.selectByIndex(2);
        Thread.sleep(2000);

        // select by Value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);

        // select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);







    }
}
