package homework07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        /*
        1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesn't effect the logic or xpath
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        // enter username
       WebElement username= driver.findElement(By.xpath("//input[@name='txtUsername']"));
       username.sendKeys("Admin");

       // enter password
        WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        // click on submit
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // click on PIM
        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        // click on Employee
        driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();

        // check the check box containing
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[3]"));

        for (int i = 0; i < column.size(); i++) {
            String text=column.get(i).getText();
            if(text.equalsIgnoreCase("baba352 ms")){
                System.out.println("baba352 ms is in the row of index "+i); // rows we start counting from 0
                System.out.println("baba352 ms is in the table index "+(i+1));

                driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]")).click();

            }
        }








    }
}
