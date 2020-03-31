package com.selenium.test;

import org.testng.annotations.Test;
import com.selenium.config.BaseConfig;
import com.selenium.page.NavegarPage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Test01 extends BaseConfig {
    
//  @Test public void example01() {
//	  NavegarPage naverPage = new NavegarPage(driver);
//      naverPage.addToCart();
//  }
  
//  @Test public void example02() {
//	  NavegarPage naverPage2 = new NavegarPage(driver);
//	  naverPage2.viewReview();
//  }
  
//  @Test public void example03() {
//	  NavegarPage naverPage3 = new NavegarPage(driver);
//	  naverPage3.registrePage();
//  }
  
//  @Test public void example04() {
//	  NavegarPage naverPage3 = new NavegarPage(driver);
//	  naverPage3.wishList();
//  }
  
  @Test public void comparative() {
	  NavegarPage naverPage3 = new NavegarPage(driver);
	  naverPage3.wishList();
  }
  
  
 
  }