package team5project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru6 {


        /* ////
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Products' button
    5. Verify user is navigated to ALL PRODUCTS page successfully
    6. Enter product name in search input and click search button
    7. Verify 'SEARCHED PRODUCTS' is visible
    8. Verify all the products related to search are visible
     */
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("http://automationexercise.com");
            WebElement anaSayfa = driver.findElement(By.xpath("//*[@href='/']"));
            if(anaSayfa.isDisplayed()){
                System.out.println("Test PASSED ");
            }else System.out.println("Test FAILED");
            driver.findElement(By.xpath("//*[@href='/products']")).click();
            WebElement allProduct= driver.findElement(By.xpath("//*[@class='title text-center']"));
            if(allProduct.isDisplayed()){
                System.out.println("Test PASSED ");
            }else System.out.println("Test FAILED");
            WebElement aramaKutusu = driver.findElement(By.id("search_product"));
            aramaKutusu.sendKeys("dress", Keys.ENTER);
            if(aramaKutusu.isDisplayed()){
                System.out.println("Test PASSED ");
            }else System.out.println("Test FAILED");

            WebElement tumUrunler = driver.findElement(By.className("google-auto-placed"));
            if(tumUrunler.isDisplayed()){
                System.out.println("Test PASSED ");
            }else System.out.println("Test FAILED");





        }
    }



