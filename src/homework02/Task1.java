package homework02;

import class01.Navigate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("customer.firstName")).sendKeys("Andrea");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.lastName")).sendKeys("Gligorijevic");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.address.street")).sendKeys("4321 Lawndale Ave");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.address.city")).sendKeys("Lyons");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.address.state")).sendKeys("Illinois");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.address.zipCode")).sendKeys("60534");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.phoneNumber")).sendKeys("+17088001597");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.ssn")).sendKeys("177-39-2868");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.username")).sendKeys("andy.candy");
        Thread.sleep(2000);

        driver.findElement(By.name("customer.password")).sendKeys("Padrinas2");
        Thread.sleep(2000);

        driver.findElement(By.name("repeatedPassword")).sendKeys("Padrinas2");
        Thread.sleep(2000);

        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);

        driver.close();




    }
}
