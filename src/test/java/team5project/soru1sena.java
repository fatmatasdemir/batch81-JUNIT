package team5project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class soru1sena {



 /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */

        WebDriver driver;


        @Before
        public void setUp() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("http://automationexercise.com");
        }

        @After
        public void tearDown() {

            driver.quit();
        }


        @Test
        public void test() throws InterruptedException {


            //Verify that home page is visible successfully
            WebElement home = driver.findElement(By.xpath("//*[text()=' Home']"));
            System.out.println("Home Page: " + home.isDisplayed());


            //4. Click on 'Signup / Login' button
            driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();


            //5. Verify 'New User Signup!' is visible
            WebElement verify = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
            System.out.println("New User Signup!: " + verify.isDisplayed());


            // Enter name and email address
            driver.findElement(By.name("name")).sendKeys("Sena");
            driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("seyuda@gmail.com");

            //7. Click 'Signup' button
            driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();


            //Verify that 'ENTER ACCOUNT INFORMATION' is visible
            System.out.println(driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed());
            ;

            //9. Fill details: Title, Name, Email, Password, Date of birth
            driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
            driver.findElement(By.xpath("//input[@data-qa='password']")).sendKeys("12356");
            driver.findElement(By.id("days")).sendKeys("2", Keys.ENTER);
            driver.findElement(By.id("months")).sendKeys("December", Keys.ENTER);
            driver.findElement(By.id("years")).sendKeys("1998", Keys.ENTER);


            //10. Select checkbox 'Sign up for our newsletter!
            WebElement checkbox = driver.findElement(By.xpath("//*[@id='newsletter']"));
            checkbox.sendKeys(Keys.ENTER);


            //11. Select checkbox 'Receive special offers from our partners!'
            driver.findElement(By.id("optin")).sendKeys(Keys.ENTER);


            //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
            driver.findElement(By.id("first_name")).sendKeys("Sena");
            driver.findElement(By.id("last_name")).sendKeys("Yücedal");
            driver.findElement(By.id("company")).sendKeys("Free");
            driver.findElement(By.id("address1")).sendKeys("Hatay/Antakya");
            driver.findElement(By.id("address2")).sendKeys("Saraykent Mah.");
            driver.findElement(By.id("country")).sendKeys("Canada");
            driver.findElement(By.id("state")).sendKeys("Quebec");
            driver.findElement(By.id("city")).sendKeys("Quebec");
            driver.findElement(By.id("zipcode")).sendKeys("31000");
            driver.findElement(By.id("mobile_number")).sendKeys("05351232343");


            Thread.sleep(2000);

            //13. Click 'Create Account button'
            driver.findElement(By.xpath("//*[text()='Create Account']")).sendKeys(Keys.ENTER);


            //14. Verify that 'ACCOUNT CREATED!' is visible
            WebElement visible = driver.findElement(By.xpath("//*[text()='Account Created!']"));
            System.out.println("ACCOUNT CREATED!: " + visible.isDisplayed());


            //15. Click 'Continue' button
            driver.findElement(By.xpath("//*[text()='Continue']")).sendKeys(Keys.ENTER);



            //16. Verify that 'Logged in as username' is visible
            System.out.println(driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed());



            //17. Click 'Delete Account' button
            driver.findElement(By.xpath("//a[@href='/delete_account']")).click();



            //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
            //HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın
            System.out.println(driver.findElement(By.xpath("//*[text()='Delete Account']")).isDisplayed());

        }


    }






















