package com.nttdata.steps;

import com.nttdata.screens.CatalogoScreen;
import com.nttdata.screens.InicioScreen;
import org.junit.Assert;


public class ProductSteps{
    CatalogoScreen catalogoScreen;
    InicioScreen inicioScreen;

 public void MostrarLogo(){

     Assert.assertTrue(inicioScreen.isLogoDisplayed());
 }

 public void SelectProducto1(){
     catalogoScreen.IngresarProduct1();
 }
 public void SelectCantidad(String cantidad){
      int c=0;
     catalogoScreen.IngresarCantidad(Integer.toString(c));

 }
 public void CantidadBtn(){
     catalogoScreen.Ingresarbtn();
 }
 public void ReggresoCatalogoGeneral(){
     catalogoScreen.RegresarAlCatalogo();
 }

 public void SelectProducto2(){
     catalogoScreen.IngresarProduct2();
 }
 public void SelectProducto3(){
     catalogoScreen.IngresarProduct3();
 }
public void MostrarCarrito(){
     catalogoScreen.btnCarrito();
     Assert.assertTrue(catalogoScreen.isCarritoDisplayed());
}

}
