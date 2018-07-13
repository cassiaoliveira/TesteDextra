package com.dextra.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class CadastroCliente {
	
	WebDriver driver;	
	
	public CadastroCliente(WebDriver driver){
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
	}
	
	public void acessaCadastroCliente(){	   
		WebElement ele = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[3]/span[2]/div/a[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);	
    }
	
	public void validaEmailCliente(String email, String senha, String cpf, String nome, String dataNasc, String gender, String phone){	   
		
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement btnCriarCadastro, 
			           emailCadastrado, 
			           _email, 
			           _senha, 
			           _cpf, 
			           _nome, 
			           _dataNasc, 
			           _phone;
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email-input")));
			_email = driver.findElement(By.id("email-input"));
			_email.sendKeys(email);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password-input")));
			_senha = driver.findElement(By.id("password-input"));
			_senha.sendKeys(senha);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cpf-input")));
			_cpf = driver.findElement(By.id("cpf-input"));
			_cpf.sendKeys(cpf);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name-input")));
			_nome = driver.findElement(By.id("name-input"));
			_nome.sendKeys(nome);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("birthday-input")));
			_dataNasc = driver.findElement(By.id("birthday-input"));
			_dataNasc.sendKeys(dataNasc);
			
					
			WebElement _gender = driver.findElement(By.xpath("//*[@id=\"gender_F\"]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", _gender);	
	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone-input")));
			_phone = driver.findElement(By.id("phone-input"));
			_phone.sendKeys(phone);
			
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/form/button")));	
		btnCriarCadastro = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button"));
		btnCriarCadastro.click();
		
		emailCadastrado = driver.findElement(By.className("inputGroup-error"));
		emailCadastrado.equals("E-mail já cadastrado");	
    }
	
	public void validaSenhaCliente(String email, String senha, String cpf, String nome, String dataNasc, String gender, String phone){	   
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement btnCriarCadastro, 
		           senhaCadastrado, 
		           senhaFraca, 
		           _email, 
		           _senha, 
		           _cpf, 
		           _nome, 
		           _dataNasc, 
		           _phone;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email-input")));
		_email = driver.findElement(By.id("email-input"));
		_email.sendKeys(email);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password-input")));
		_senha = driver.findElement(By.id("password-input"));
		_senha.sendKeys(senha);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cpf-input")));
		_cpf = driver.findElement(By.id("cpf-input"));
		_cpf.sendKeys(cpf);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name-input")));
		_nome = driver.findElement(By.id("name-input"));
		_nome.sendKeys(nome);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("birthday-input")));
		_dataNasc = driver.findElement(By.id("birthday-input"));
		_dataNasc.sendKeys(dataNasc);
		
				
		WebElement _gender = driver.findElement(By.xpath("//*[@id=\"gender_F\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", _gender);	

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone-input")));
		_phone = driver.findElement(By.id("phone-input"));
		_phone.sendKeys(phone);
		
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/form/button")));	
	btnCriarCadastro = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button"));
	btnCriarCadastro.click();
	
	senhaFraca = driver.findElement(By.className("passwordWrapper-msg"));
	senhaFraca.getText();
	senhaFraca.equals("fraca");
	System.out.println(senhaFraca);
	
	
	senhaCadastrado = driver.findElement(By.className("inputGroup-error"));
	senhaCadastrado.equals("Senha precisa ter entre 6 a 50 caracteres.");
}
	
	public void validaCPFCliente(String email, String senha, String cpf, String nome, String dataNasc, String gender, String phone){	   
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement btnCriarCadastro, 
		           cpfCadastrado, 
		           _email, 
		           _senha, 
		           _cpf, 
		           _nome, 
		           _dataNasc, 
		           _phone;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email-input")));
		_email = driver.findElement(By.id("email-input"));
		_email.sendKeys(email);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password-input")));
		_senha = driver.findElement(By.id("password-input"));
		_senha.sendKeys(senha);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cpf-input")));
		_cpf = driver.findElement(By.id("cpf-input"));
		_cpf.sendKeys(cpf);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name-input")));
		_nome = driver.findElement(By.id("name-input"));
		_nome.sendKeys(nome);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("birthday-input")));
		_dataNasc = driver.findElement(By.id("birthday-input"));
		_dataNasc.sendKeys(dataNasc);
		
				
		WebElement _gender = driver.findElement(By.xpath("//*[@id=\"gender_F\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", _gender);	

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone-input")));
		_phone = driver.findElement(By.id("phone-input"));
		_phone.sendKeys(phone);
		
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/form/button")));	
	btnCriarCadastro = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button"));
	btnCriarCadastro.click();	
	
	cpfCadastrado = driver.findElement(By.className("inputGroup-error"));
	cpfCadastrado.equals("Campo inválido.");
}
	
	public void cadastraCliente(String email, String senha, String cpf, String nome, String dataNasc, String gender, String phone){	   
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement btnCriarCadastro, 
		           cpfCadastrado, 
		           _email, 
		           _senha, 
		           _cpf, 
		           _nome, 
		           _dataNasc, 
		           _phone;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email-input")));
		_email = driver.findElement(By.id("email-input"));
		_email.sendKeys(email);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password-input")));
		_senha = driver.findElement(By.id("password-input"));
		_senha.sendKeys(senha);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cpf-input")));
		_cpf = driver.findElement(By.id("cpf-input"));
		_cpf.sendKeys(cpf);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name-input")));
		_nome = driver.findElement(By.id("name-input"));
		_nome.sendKeys(nome);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("birthday-input")));
		_dataNasc = driver.findElement(By.id("birthday-input"));
		_dataNasc.sendKeys(dataNasc);
		
				
		WebElement _gender = driver.findElement(By.xpath("//*[@id=\"gender_F\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", _gender);	

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone-input")));
		_phone = driver.findElement(By.id("phone-input"));
		_phone.sendKeys(phone);
		
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/form/button")));	
	btnCriarCadastro = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button"));
	btnCriarCadastro.click();	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"h_usr-link\"]/span[2]")));
	WebElement home = driver.findElement(By.xpath("//*[@id=\"h_usr-link\"]/span[2]"));
	home.equals("minha conta");	
	
		
    
	
	
}
public void pesquisaProdutos(String descricao){	   
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement busca, motoG;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("h_search-input")));
		busca = driver.findElement(By.id("h_search-input"));
		busca.sendKeys(descricao);

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", busca);	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[2]/div/div[1]/ul/li[2]/a/span")));
		motoG = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[2]/div/div[1]/ul/li[2]/a/span"));
		motoG.click();	
}

public void addProdutos(){	   
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement busca,addProd;
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/div[2]/div[5]/div/div/div/div[2]/div[1]/section/a/div[1]/figure/div/div/picture/img")));
	busca = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/div[2]/div[5]/div/div/div/div[2]/div[1]/section/a/div[1]/figure/div/div/picture/img"));
	executor.executeScript("arguments[0].click();", busca);	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn-buy\"]")));
	addProd = driver.findElement(By.xpath("//*[@id=\"btn-buy\"]"));	
	executor.executeScript("arguments[0].click();", addProd);	
	
	
}

}
