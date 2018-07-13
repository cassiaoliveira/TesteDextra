package com.dextra.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
	WebDriver driver;
	
	public SetUp(WebDriver driver){
		this.driver = driver;		
	}
	
	public void abreLink(String url){
		   /*Inicia e faz login*/	 
			    System.setProperty("webdriver.gecko.driver", "D:/geckodriver-v0.21.0-win64/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.americanas.com.br");
				WebElement login = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[3]/span[1]/div"));
				login.equals("olá, faça seu login");
				acessaCadastroCliente();
		}
	
	public void acessaCadastroCliente(){	   
		WebElement ele = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[3]/span[2]/div/a[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);	
    }
}
