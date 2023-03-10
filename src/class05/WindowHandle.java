package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        // create instance of Webdriver
        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to gmail.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1677800315%3A1678243138138330&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdbRmi3D53H2F_wskJpQ1oMixNsT4ndnTtQyhj9FHpog0KCBKS-J3v9qp3PN8gQxUGEuTCU");

        // click on help
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        // click on privacy button
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // get the window handle of the parent window
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println("This is parent Window handle : "+parentWindowHandle);

        // get window handles of ALL the windows that have been opened up
        Set<String> windowHandles=driver.getWindowHandles();

        // print all the window handles
        for(String wh:windowHandles){

            // switch the focus of the driver to help window
            driver.switchTo().window(wh);

            //check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy - Privacy & Terms - Google")){
                break;
            }
        }
        // to verify we switched to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);






    }
}
