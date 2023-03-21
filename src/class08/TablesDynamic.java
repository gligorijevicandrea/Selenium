package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDynamic {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();

        //        enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

//      check the checkbox containing the product screensaver
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

//      iterate through each to see if it contains screen saver
        for (int i = 0; i < column.size(); i++) {
            // extract the text
            String text=column.get(i).getText();
            // we are matching entry so we use .equals
            if(text.equalsIgnoreCase("ScreenSaver")){
                System.out.println(text);
                System.out.println("the screensaver is located at row number "+i); // or i+2;
                System.out.println("check the check box");

                WebElement checkbox=driver.findElement(By.xpath("//table[@class='SampleTable']//tr["+(i+2)+"]/td[1]/input"));
                checkbox.click();
            }
        }








    }



}
