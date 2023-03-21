package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesSimple {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

  //    task 1 : access-level1--table based access
  //    get the whole table accessed and print it on the console
        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data=table.getText();
 //       System.out.println(table_data);

 //     task 2 : row level access
 //     get the rows of the table and print them
        List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

//        // print ALL the rows
       for(WebElement row:Rows){
//        //  extract text from each row
//            String row_text= row.getText();
//           System.out.println(row_text);
//        }

        // print the row that contains Company Google
 //       for(WebElement row:Rows){
            String row_text= row.getText();
            if(row_text.contains("Google")){
 //               System.out.println(row_text);
            }
        }


//      task 3: column level access
        List<WebElement> colums=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:colums){
       //     System.out.println(column.getText());
        }

//      task 4: print all from the first column of every row
        List<WebElement> first_columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement first_col:first_columns){
            System.out.println(first_col.getText());
        }







    }
}
