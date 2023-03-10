package homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();


        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        Thread.sleep(2000);

        driver.findElement(By.id("user-message")).sendKeys("I'm crazy");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("sum1")).sendKeys("10");
        Thread.sleep(2000);

        driver.findElement(By.id("sum2")).sendKeys("20");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        Thread.sleep(2000);

        WebElement value= driver.findElement(By.id("displayvalue"));
        String valueText=(value.getText());
        System.out.println(valueText);








    }
}
