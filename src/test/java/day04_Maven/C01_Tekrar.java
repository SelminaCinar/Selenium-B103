package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

       // Arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("Tag Name TEST PASSED" + actualTagName);
        }else System.out.println("Tag Name TEST FAILED" + actualTagName);

       // Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String actualAtributeName = aramaKutusu.getAttribute("name");
        String expectedAtributeNAme ="field-keywords";
        if (actualAtributeName.equals(expectedAtributeNAme)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

       // Sayfayı kapatınız
        driver.close();
    }
}
