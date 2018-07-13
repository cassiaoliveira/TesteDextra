package com.dextra.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcessaCadastroCliente {
	
WebDriver driver;	
	
	public AcessaCadastroCliente(WebDriver driver){
		this.driver = driver;		
	}
	public void acessaCadastroCliente(){	   
		WebElement ele = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[3]/span[2]/div/a[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);	
    }
}
