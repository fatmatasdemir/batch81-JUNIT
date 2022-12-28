package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {


     System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("   " );

        driver.getCurrentUrl();

        driver.manage().window().maximize();

        driver.getTitle();

        driver.getPageSource();

        driver.getWindowHandle();

        driver.navigate();

        driver.quit();

        driver.close();

        driver.wait();  // ZAMAN ICIN  SANIYE DAKIKA ayarlamak icin sayfalar arasi


         Thread.sleep(2000);


         //Hocam; anasayfaya gittiğimizin kontrolü için en doğru olarak hangi elementi Locate'i etmeli veya doğrulama yapmalıyız ?
        //URL kontrolü   --- Title kontrolu yapilabilir locat alinabilir


}


}
