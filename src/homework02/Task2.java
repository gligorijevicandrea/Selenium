package homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    /*
    navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clcikng on create new account
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Andrea");
        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("Gligorijevic");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("+17088001597");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("Padrinas2");
        Thread.sleep(2000);

        driver.findElement(By.id("day")).sendKeys("24");
        Thread.sleep(2000);

        driver.findElement(By.id("month")).sendKeys("July");
        Thread.sleep(2000);

        driver.findElement(By.id("year")).sendKeys("1992");
        Thread.sleep(2000);

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);

        driver.close();
        Thread.sleep(2000);






    }
}
