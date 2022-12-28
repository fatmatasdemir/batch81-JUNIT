package team5project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru5 {


    /*
        1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. The products list is visible
7. Click on 'View Product' of first product
8. User is landed to product detail page
9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
         */

        WebDriver driver;

        @Before
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @After
        public void tearDown() {
            //driver.close();
        }

        @Test
        public void test() {
            //        1. Tarayıcıyı başlatın
            //2. 'http://automationexercise.com' url'sine gidin
            driver.get("http://automationexercise.com");

            //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
            WebElement logo = driver.findElement(By.xpath("//*[@class='fa fa-home']"));
            Assert.assertTrue(logo.isDisplayed());

            //4. 'Ürünler' düğmesine tıklayın
            driver.findElement(By.xpath("//*[@class='material-icons card_travel']")).click();

            //5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
            WebElement tumurunler = driver.findElement(By.xpath("//*[@class='title text-center']"));
            Assert.assertTrue(tumurunler.isDisplayed());

            //6. Ürün listesi görünür
            WebElement urunlistesi = driver.findElement(By.xpath("//*[@class='title text-center']"));
            Assert.assertTrue(urunlistesi.isDisplayed());

            //7. İlk ürünün 'Ürünü Görüntüle'ye tıklayın

            driver.findElement(By.linkText("View Product")).click();
            //driver.findElement(By.xpath("//*[text()='View Product']")).click();

            //8. Kullanıcı, ürün detay sayfasına yönlendirilir

            String expectedTitle = "Automation Exercise - Product Details";
            String actualTitle = driver.getTitle();
            Assert.assertTrue(actualTitle.contains(expectedTitle));

            //9. Ayrıntıların görünür olduğunu doğrulayın: ürün adı, kategori, fiyat, bulunabilirlik, durum, marka  */
            WebElement urunadi = driver.findElement(By.xpath("//h2"));
            if (urunadi.isDisplayed()) {
                System.out.println("urun adı göründü test PASSED");
            } else {
                System.out.println("urun adı görünmedi test FAILED");
            }

            WebElement kategori = driver.findElement(By.xpath("//*[text()='Category: Women > Tops']"));
            if (kategori.isDisplayed()) {
                System.out.println("Kategori göründü test PASSED");
            } else {
                System.out.println("kategori görünmedi test FAILED");
            }

            WebElement fiyat = driver.findElement(By.xpath("//*[text()='Rs. 500']"));
            if (fiyat.isDisplayed()) {
                System.out.println("Fiyat göründü test PASSED");
            } else {
                System.out.println("Fiyat görünmedi test FAILED");
            }

            WebElement bulunabilirlik = driver.findElement(By.xpath("//*[text()='Availability:']"));
            if (bulunabilirlik.isDisplayed()) {
                System.out.println("Bulunabilirlik göründü test PASSED");
            } else {
                System.out.println("Bulunabilirlik görünmedi test FAILED");
            }

            WebElement durum = driver.findElement(By.xpath("//*[text()='Condition:']"));
            if (durum.isDisplayed()) {
                System.out.println("Durum göründü test PASSED");
            } else {
                System.out.println("Durum görünmedi test FAILED");
            }

            WebElement marka = driver.findElement(By.xpath("//*[text()='Brand:']"));
            if (marka.isDisplayed()) {
                System.out.println("Marka göründü test PASSED");
            } else {
                System.out.println("Marka görünmedi test FAILED");
            }
        }









}
