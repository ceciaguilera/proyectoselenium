package com.selenium.config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseConfig {

  public WebDriver driver;

  @BeforeMethod()
  public void getDriver() {
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    driver = new ChromeDriver();
    //
    driver.manage().deleteAllCookies();
    driver.navigate().to("http://opencart.abstracta.us/index.php?route=common/home");
    //
    System.out.println("Successfully opened the website http://opencart.abstracta.us/index.php?route=common/home");
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod()
  public void teardownTest() {
    // Close browser and end the session
    driver.quit();
  }
}
