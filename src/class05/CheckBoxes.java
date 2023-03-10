package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        // create instance of Webdriver
        WebDriver driver=new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        // get all the checkboxes
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));

//        // iterate through the list For Loop - 1. WAY
//        for(int i=0; i<checkBoxes.size();i++){
//
//            String value=checkBoxes.get(i).getAttribute("value");
//
//            //check if this is desired one , if YES = click it , if NOT - continue to iterate
//            if(value.equalsIgnoreCase("Option-2")){
//                checkBoxes.get(i).click();
//            }
//
////        }
//        // iterate through the list  Enhanced - for each loop - 2. WAY
        for(WebElement checkbox:checkBoxes){
            String value=checkbox.getAttribute("value");
            if(value.equalsIgnoreCase("Option-2")){
                checkbox.click();
            }
        }


//




    }
}
