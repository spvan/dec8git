/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author spvan_92fxbhk
 */
public class TjmaxxTest {
    private WebDriver driver;
    private String baseUrl;
    
    public TjmaxxTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
       
    }

     @Test
  public void testContactUs() throws Exception {
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.manage().window().maximize();
    driver.get("https://tjmaxx.tjx.com/store/account/profile.jsp");
//    driver.findElement(By.xpath("//div[@id='site-wrapper']/header/div/div/div[2]/nav/ul/li[2]/div/a/span")).click();
//    driver.findElement(By.linkText("Account Information")).click();
     driver.findElement(By.id("login-id")).click();
    driver.findElement(By.id("login-id")).clear();
    driver.findElement(By.id("login-id")).sendKeys("spvanitha80@gmail.com");
    driver.findElement(By.id("loginSubmit")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Mathematics2001$");
    driver.findElement(By.id("usmm-tl-cat1160005p")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/men/_/N-1324638658?tn=4");
    driver.get("https://tjmaxx.tjx.com/store/shop/mens-clothing/_/N-2598235297?ln=2:1");
    driver.findElement(By.xpath("//div[@id='style-1000671920']/div/div/a/img[2]")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/men-clothing/Cvc-Fleece-Crew-Neck/1000671920?colorId=NS10642248&pos=1:1&N=2598235297");
    driver.findElement(By.id("addItemToOrder")).click();
   
    driver.manage().deleteAllCookies();
    driver.close();
    

}
}
