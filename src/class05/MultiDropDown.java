package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        // create instance of Webdriver
        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // locate the WebElement
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select sel=new Select(DD);

        // select by value
        sel.selectByValue("New Jersey");

        // select by visible text
        sel.selectByVisibleText("Ohio");

        Thread.sleep(2000);

        // Deselect available only  in Multi Select DropDown
        sel.deselectByValue("New Jersey");

        sel.deselectByVisibleText("Ohio");






    }
}
