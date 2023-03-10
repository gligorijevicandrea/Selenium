package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// 3 methods in frames : 1. by Index  2. by name  3. by web element (Xpath.. starts with // , double slash)
public class Frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        // create instance of Webdriver
        WebDriver driver=new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        // switch to the iframe which contains the input box

        // 1. Method : by Index
        driver.switchTo().frame(0);

        // this statement will shift the focus to the first frame
        WebElement textBox=driver.findElement(By.xpath("//input[@id='name']"));

        // send keys
        textBox.sendKeys("abracadabra");

        // get the text Click on from parent window
        driver.switchTo().defaultContent(); // to switch to the parent window(default content)

        // 2.  find the text by Name
        WebElement text= driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());

        // get the text Enter name in iframe
        driver.switchTo().frame("iframe_a");

        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("the label is : "+getLabel.getText());

        // switch focus to the main page
        driver.switchTo().defaultContent();

        // 3. Method - switch to iframe using Web Element
        // clear whatever is written in the text box
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();













    }
}
