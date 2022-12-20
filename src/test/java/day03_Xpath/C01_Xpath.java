package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin 2- Add Element butonuna basin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        Thread.sleep(3);
      // WebElement addButton= driver.findElement(By.xpath("//*[@onclick='addElement()']"));
       WebElement addButtont= driver.findElement(By.xpath("//*[text() ='Add Element']"));
        //               <button onclick="addElement()">Add Element</button>
       //Xpath kullaniminda locate edecegimiz webelement text'e sahipse yukardaki sekilde kullanabiliriz.
       addButtont.click();
//        Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()){//Webelementin gorunur olup olmadigini isDisplayed() methodu ile kontrol ederiz.
            System.out.println("Delete Butonu Gorunuyor TEST PASSED");
        }else System.out.println("Delete Butonu Gorunuyor TEST FAILED");
//
//        Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();

//       "Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementYazisi = driver.findElement(By.xpath("//h3"));
        if (addRemoveElementYazisi.isDisplayed()){//Webelementin gorunur olup olmadigini isDisplayed() methodu ile kontrol ederiz.
            System.out.println(" Buton Gorunuyor TEST PASSED");
        }else System.out.println("Buton Gorunmuyor TEST FAILED");
    }
}
