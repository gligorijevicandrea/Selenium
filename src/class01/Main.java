package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        String path="https://www.google.com/";
        driver.get(path);

        System.out.println(driver.getCurrentUrl());


        System.out.println(driver.getTitle());

       String URL= driver.getCurrentUrl();
        System.out.println(path);
        System.out.println(URL);

       String title= driver.getTitle();

       if(path.equalsIgnoreCase(URL)){
           System.out.println("Match");
       }else {
           System.out.println("No match");
       }

        if(title.equalsIgnoreCase("Google")){
            System.out.println("Match");
        }else {
            System.out.println("No match");
        }

        driver.quit();

    }



}