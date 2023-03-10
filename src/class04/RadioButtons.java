package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        // click on radio button male
        WebElement maleBtn =driver.findElement(By.cssSelector("input[value='Male']"));

        // check if the radio button is enabled
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);

        // check if the radio button is displayed
        boolean isDisplayedmale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedmale);

        // check if the radio button is selected
        boolean isSelectedmale=maleBtn.isSelected();
        System.out.println("the radio button male is selected "+isSelectedmale);

        // if the radio button is not selected click on it
        if(!isSelectedmale){
            maleBtn.click();
        }

        // check if the radio button is selected after the click
        isSelectedmale=maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedmale);











    }
}
