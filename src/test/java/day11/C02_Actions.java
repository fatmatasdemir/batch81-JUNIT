package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C02_Actions extends TestBaseBeforeAfter {

    @Test
    public void test1() {
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //Cerezleri kabul edin
        driver.findElement(By.xpath("//*[text()='Temel ve isteğe bağlı çerezlere izin ver'] ")).click();
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        //Actions actions = new Actions(driver);
        WebElement isim = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        isim.sendKeys("Fatma");
        actions.sendKeys(Keys.TAB).
                sendKeys("Tasdemir").
                sendKeys(Keys.TAB).
                sendKeys("t.demir63@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("t.demir63@gmail.com").
                sendKeys(Keys.TAB).sendKeys("123456").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("15").sendKeys(Keys.TAB).sendKeys("Tem").
                sendKeys(Keys.TAB).sendKeys("1988").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.RIGHT).sendKeys(Keys.LEFT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();


    }







}
