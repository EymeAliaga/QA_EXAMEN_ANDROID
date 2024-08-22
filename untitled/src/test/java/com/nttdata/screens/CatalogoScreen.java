package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CatalogoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"View menu\"]")
    private WebElement inicio;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Catalog\"]")
    private WebElement catalogo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement Product1;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement AumentarP1;

    @AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnIngresar;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement Product2;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement Product3;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement Carrito;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement LogoCarrito;

    public void IngresarProduct1(){
        Product1.click();
    }

    public void IngresarCantidad(String cantidad){
        AumentarP1.sendKeys(cantidad);

    }
    public void Ingresarbtn(){
        btnIngresar.click();
    }

    public void RegresarAlCatalogo(){
        inicio.click();
        catalogo.click();
    }


    public void IngresarProduct2(){
        Product2.click();
    }


    public void IngresarProduct3(){
        Product3.click();
    }
    public void btnCarrito(){
        Carrito.click();
    }
    public boolean isCarritoDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(LogoCarrito));
        return LogoCarrito.isEnabled();
    }




}
