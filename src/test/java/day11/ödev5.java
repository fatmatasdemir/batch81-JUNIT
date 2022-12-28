package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class ödev5  extends TestBaseBeforeAfter {

    //Ödev 2
//Bir Class olusturalim KeyboardActions2
//https://html.com/tags/iframe/ sayfasina gidelim
// 3- video'yu gorecek kadar asagi inin
//videoyu izlemek icin Play tusuna basin
//videoyu calistirdiginizi test edin

    @Test
    public void test1() throws InterruptedException {
        // https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");

        // 3- video’yu gorecek kadar asagi inin
        WebElement yanTus = driver.findElement(By.xpath("//*[@class='site-header clearfix']"));
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();

        // videoyu izlemek icin Play tusuna basin
        WebElement youtubeFrame = driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(youtubeFrame);
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();

        // videoyu calistirdiginizi test edin
        //  WebElement iframr =driver.findElement(By.tagName("iframe"));
        //  Assert.assertTrue(iframr.isDisplayed());

     /*   WebElement duraklatButonu = driver.findElement(By.xpath("//*[@title='Duraklat (k)']"));
        Assert.assertTrue(duraklatButonu.isDisplayed());
     */
        //videoyu calistirdiginizi test edin
       // Thread.sleep(2000);
        WebElement youtubeLinki=driver.findElement(By.xpath("//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
        Assert.assertTrue(youtubeLinki.isDisplayed());
        driver.switchTo().defaultContent( );


    }













}
