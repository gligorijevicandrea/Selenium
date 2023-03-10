package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // go to facebook.com
        driver.get("https://www.facebook.com/");

        // click on the button create account using CSS colector (returns webelement)
        WebElement createNewBtn =driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']"));

        //click on the button
        createNewBtn.click();

        // sleep - so browser can open up the window which contains the element
        Thread.sleep(2000);

        // fill in the first Name
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("abracadbara");

        //



    }
}
