package homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    /*
    goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not
     */
    // 1. inspect the checkbox
    // 2. write down the correct locator in the DOM
    // 3. use find Element the find the check box

    // if i want to check that box is selected or not?
    // checkbox.isSelected(); ---> true (means selected)

    // Prefered approach when it comes to multiple checkboxes
    //1. inspect them in DOM
    //2. write the locator in such a way that it is able to select all the required checkboxes
    //3. use find Elements to get all those checkboxes
    //4. iterate through the list
    //5. while iteration



        public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

            // create instance of Webdriver
            WebDriver driver = new ChromeDriver();

            // max the window
            driver.manage().window().maximize();

            // go to syntaxprojects.com
            driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

            // get all the checkboxes
            List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

//        // iterate through the list For Loop - 1. WAY
            for (int i = 0; i < checkBoxes.size(); i++) {

                String value = checkBoxes.get(i).getAttribute("value");

                //check if this is desired one , if YES = click it , if NOT - continue to iterate
                if (value.equalsIgnoreCase("Option-2")) {
                    checkBoxes.get(i).click();
                }

            }
        }
    }















