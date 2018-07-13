package com.dextra.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PesquisarProduto {
	
	WebDriver driver;		
	public PesquisarProduto(WebDriver driver){
		this.driver = driver;		
	}
	
	public void pesquisaProduto(String descricao){  
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement busca;
		
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("h_search-input")));
			    busca = driver.findElement(By.id("h_search-input"));
				busca.sendKeys(descricao);     
		
	}
	
	public void selecionarProduto(){  
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement busca;
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("h_search-input")));
	    busca = driver.findElement(By.id("h_search-input"));
		busca.click();     

}
	
	
	
}
