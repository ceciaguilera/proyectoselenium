package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import com.selenium.config.BaseConfig;

public class NavegarPage extends BaseConfig {

  public NavegarPage(WebDriver driver) {
    super();
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
 
  @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
  private WebElement menuLaptosyNote;
  
  @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/div/ul/li[1]/a")
  private WebElement Mac;
  
  @FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/a[2]")
  private WebElement LyN;
  
  @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img")
  private WebElement elem;
  
  @FindBy(xpath = "//*[@id=\"button-cart\"]")
  private WebElement elem2;
  
  @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
  private WebElement Desktop;
  
  @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")
  private WebElement macMenu;
  
  @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")
  private WebElement elem3;
  
  @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")
  private WebElement Reviews;
  
  @FindBy(xpath = "//*[@id=\"input-name\"]")
  private WebElement name;
  
  @FindBy(xpath = "//*[@id=\"input-review\"]")
  private WebElement comentario;
  
  @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
  private WebElement phonesyPDAs;
  
  @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]")
  private WebElement MyAccount;
  
  @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
  private WebElement Registre;
  
  @FindBy(xpath = "//*[@id=\"input-firstname\"]")
  private WebElement firstname;
  
  @FindBy(xpath = "//*[@id=\"input-lastname\"]")
  private WebElement lastname;

  @FindBy(xpath = "//*[@id=\"input-email\"]")
  private WebElement email;

  @FindBy(xpath = "//*[@id=\"input-telephone\"]")
  private WebElement telephone;

  @FindBy(xpath = "//*[@id=\"input-address-1\"]")
  private WebElement address;

  @FindBy(xpath = "//*[@id=\"input-city\"]")
  private WebElement city;

  @FindBy(xpath = "//*[@id=\"input-postcode\"]")
  private WebElement postcode;

  @FindBy(xpath = "//*[@id=\"input-country\"]")
  private WebElement country;

  @FindBy(xpath = "//*[@id=\"input-zone\"]")
  private WebElement zone;

  @FindBy(xpath = "//*[@id=\"input-password\"]")
  private WebElement password;

  @FindBy(xpath = "//*[@id=\"input-confirm\"]")
  private WebElement confirmPassword;

  @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
  private WebElement botonConfirmRegitre;
  
  @FindBy(xpath = "//*[@id=\"search\"]/input")
  private WebElement buscar;
  
  @FindBy(xpath = "//*[@id=\"search\"]/span/button")
  private WebElement buscarLupa;
  
  @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[3]/label/input")
  private WebElement subcategorias;
  
  @FindBy(xpath = "//*[@id=\"button-search\"]")
  private WebElement buttonSearch;
  
  @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
  private WebElement content;

  @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[3]/a/img")
  private WebElement elem4;

  @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[4]/a/img")
  private WebElement elem5;

  @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")
  private WebElement elem6;

  @FindBy(xpath = "//*[@id=\"wishlist-total\"]/span")
  private WebElement elem7;
  
  @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/a")
  private WebElement software;

  @FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/a[2]")
  private WebElement lyN;

  @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img")
  private WebElement elem8;

  @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[1]/button[2]")
  private WebElement elem9;

  @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
  private WebElement elem10;

  @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[1]/button[2]")
  private WebElement elem11;
 
  public NavegarPage addToCart() {
	  menuLaptosyNote.click();
	  Mac.click();
	  LyN.click();
	  elem.click();
	  elem2.click();
	  return new NavegarPage(driver);
  }
  
  public NavegarPage viewReview() {
	  Desktop.click();
	  macMenu.click();
	  elem3.click();
	  Reviews.click();
	  name.sendKeys("Usuario Prueba");
	  name.click();
	  
	  comentario.sendKeys("Ok");
	  comentario.click();
	  return new NavegarPage(driver);
  }
  
  public NavegarPage registrePage() {

	  MyAccount.click();
	  Registre.click();
	  
	  firstname.sendKeys("Cecilia");
	  firstname.click();
	  
	  lastname.sendKeys("Aguilera");
	  lastname.click();
	  
	  email.sendKeys("caguilera@gmail.com");
	  email.click();
	  
	  telephone.sendKeys("949618107");
	  telephone.click();
	  
	  address.sendKeys("San Ignacio 25");
	  address.click();
	  
	  city.sendKeys("Santiago");
	  city.click();
	  
	  postcode.sendKeys("000022778");
	  postcode.click();
	  
	  country.sendKeys("Chile");
	  country.click();
	  
	  zone.sendKeys("Metropolitana");
	  zone.click();
	  
	  password.sendKeys("1234");
	  password.click();
	  
	  confirmPassword.sendKeys("1234");
	  confirmPassword.click();
	  
	  botonConfirmRegitre.click();
	  return new NavegarPage(driver);
  }
  
  public NavegarPage wishList() {
	  buscar.sendKeys("Iphone");
	  buscar.click();
	  
	  buscarLupa.click();
	  subcategorias.click();
	  buttonSearch.click();
	  content.click(); 
	  elem4.click();
	  elem5.click();
	  elem6.click();
	  elem7.click();
	  return new NavegarPage(driver);
  }
  
  public NavegarPage comparative() {
	  software.click();
	  lyN.click();
	  elem8.click();
	  elem9.click(); 
	  software.click();
	  lyN.click();
	  elem10.click();
	  elem11.click();
	  return new NavegarPage(driver);
  }

 
}
