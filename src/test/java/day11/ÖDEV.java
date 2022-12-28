package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class ÖDEV extends TestBaseBeforeAfter {

    /*
//Yeni Class olusturun ActionsClassHomeWork
1- "http://webdriveruniversity.com/Actions" sayfasina gidin  2- Hover over Me First" kutusunun ustune gelin
2-Link 1" e tiklayin
3-Popup mesajini yazdirin
4-Popup'i tamam diyerek kapatin
5-"Click and hold" kutusuna basili tutun
6-"Click and hold" kutusunda cikan yaziyi yazdirin
7- "Double click me" butonunu cift tiklayin

*/
   @Test
           public void test() {

       //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
       driver.get("http://webdriveruniversity.com/Actions");
       // 2- Hover over Me First" kutusunun ustune gelin
       WebElement hoverOver = driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
      // Actions actions = new Actions(driver);

       actions.moveToElement(hoverOver).perform();
       //Link 1" e tiklayin
       driver.findElement(By.xpath("(//a[text()='Link 1'])[1]")).click();
       //Popup mesajini yazdirin
       System.out.println("Popup mesajı = " + driver.switchTo().alert().getText());
       //Popup'i tamam diyerek kapatin
       driver.switchTo().alert().accept();
       //“Click and hold" kutusuna basili tutun
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("scrollBy(0,200)");//===> **** Sayfayi asagi yönde 200px indirir *****
       WebElement clickAndHold = driver.findElement(By.xpath("//*[text()='Click and Hold!']"));
       //clickAndHold.click();
       actions.clickAndHold(clickAndHold).perform();
       //7-“Click and hold" kutusunda cikan yaziyi yazdirin
       WebElement clickAndHoldd = driver.findElement(By.xpath("//*[text()='Well done! keep holding that click now.....']"));
       System.out.println("Click and Hold yazısı : " + clickAndHoldd.getText());
       //8- “Double click me" butonunu cift tiklayin
       actions.doubleClick(driver.findElement(By.tagName("h2"))).perform();


   }









}
